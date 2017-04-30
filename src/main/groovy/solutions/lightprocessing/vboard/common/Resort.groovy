package solutions.lightprocessing.vboard.common

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = 'resorts')
class Resort {
    @Id
    @GeneratedValue(generator = 'id_gen')
    @SequenceGenerator(name = 'id_gen', sequenceName = 'id_seq')
    Long id
    String name
    String description
}
