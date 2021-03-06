package solutions.lightprocessing.vboard.persistence.configuration

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories('solutions.lightprocessing.vboard.persistence')
@EntityScan('solutions.lightprocessing.vboard.common')
class PersistenceConfiguration {}
