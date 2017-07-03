package com.lolimprove.batches.jobs;

import com.lolimprove.batches.listeners.JobCompletionNotificationListener;
import com.lolimprove.batches.processors.ChampionRetrievalProcessor;
import com.lolimprove.batches.readers.ChampionListDTOReader;
import com.lolimprove.dto.static_content.champions.ChampionListDTO;
import com.lolimprove.model.Champion;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration
public class BatchConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public ChampionRetrievalProcessor processor() { return new ChampionRetrievalProcessor(); }

    @Bean
    public ItemReader<ChampionListDTO> reader() { return new ChampionListDTOReader(); }

    @Bean
    public Job importChampionsJob(JobCompletionNotificationListener jobCompletionNotificationListener) {
        return jobBuilderFactory.get("championRetrievalJob")
                .incrementer(new RunIdIncrementer())
                .listener(jobCompletionNotificationListener)
                .flow(step1())
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<ChampionListDTO, List<Champion>> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(new JpaItemWriter<>())
                .build();
    }



}
