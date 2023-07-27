package SamwaMoney.TimeTableArtist.Timetable.repository;

import SamwaMoney.TimeTableArtist.Class.domain.Class;
import SamwaMoney.TimeTableArtist.Timetable.domain.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long> {

    Optional<Timetable> findByTimetableIdAndOwner(Long timetableId, Long memberId);
    List<Class> findAllByTimetableId(Long timetableId);
    Optional<Timetable> findById(Long timetableId);
    Timetable findByTimetableId (Long timetableId);

}
