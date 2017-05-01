package solutions.lightprocessing.vboard.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import solutions.lightprocessing.vboard.common.Resort
import solutions.lightprocessing.vboard.persistence.ResortRepository

@Service
class ResortService {
    @Autowired
    ResortRepository resortRepository

    List<Resort> getAll() {
        resortRepository.findAll()
    }

    long getCount() {
        resortRepository.count()
    }
}
