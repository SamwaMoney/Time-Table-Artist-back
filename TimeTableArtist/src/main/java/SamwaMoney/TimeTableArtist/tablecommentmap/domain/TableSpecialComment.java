package SamwaMoney.TimeTableArtist.tablecommentmap.domain;

import SamwaMoney.TimeTableArtist.Comment.entity.SpecialComment;
import SamwaMoney.TimeTableArtist.Timetable.domain.Timetable;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TableSpecialComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_specialcomment_id", nullable = false, updatable = false)
    private Long tableSpecialCommentId;

    @ManyToOne
    @JoinColumn(name="timetable_id")
    private Timetable timetable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="specialcomment_id")
    private SpecialComment specialComment;

    @Builder
    public TableSpecialComment (Timetable timetable, SpecialComment specialComment) {
        this.timetable = timetable;
        this.specialComment = specialComment;
    }
}
