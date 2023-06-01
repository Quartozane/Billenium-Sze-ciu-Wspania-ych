package szesciu.wspanialych.version1.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import szesciu.wspanialych.version1.Model.Visitations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface VisitationsRepository extends MongoRepository<Visitations, ObjectId> {
//    boolean existsById(ObjectId id);
//    List<Visitations> findByAppointmentDate(LocalDateTime appointmentDate);
//    List<Visitations> findByDate(LocalDateTime date);
//    List<Visitations> findByVisitStatus(boolean visitStatus);
//    List<Visitations> findAll();
//    @Query(value = "{'patientId': ?0}")
//    List<Visitations> findAllByPatientId(ObjectId patientId);
    List<Visitations> findByappointmentBookingDate(LocalDate appointmentBookingDate);
}

