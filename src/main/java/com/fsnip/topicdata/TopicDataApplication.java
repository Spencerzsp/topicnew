package com.fsnip.topicdata;

import com.fsnip.topicdata.utils.SensitiveInfoUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@Import({SensitiveInfoUtils.class})
public class TopicDataApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TopicDataApplication.class, args);
    }
}
