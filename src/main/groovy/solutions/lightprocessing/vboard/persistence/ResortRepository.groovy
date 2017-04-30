package solutions.lightprocessing.vboard.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.vboard.common.Resort

@Repository
interface ResortRepository extends JpaRepository<Resort, Long> {
    Resort findByName(String name)
}