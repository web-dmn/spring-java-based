package rom.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import rom.service.JpaService;
import rom.service.impl.JpaServiceImpl;

/**
 * Created by Java on 2017/03/15.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "rom.web"})
public class MvcConfig extends WebMvcConfigurerAdapter{

    /* 静的ファイルの設定 */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
    }

    /* 静的ファイルをデフォルトのサーブレットへ渡す */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /* Viewの設定 */
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }

    @Bean
    public JpaService jpaService() {
        JpaService jpaService = new JpaServiceImpl();
        return jpaService;
    }
}
