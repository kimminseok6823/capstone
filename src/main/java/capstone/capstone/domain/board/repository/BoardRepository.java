package capstone.capstone.domain.board.repository;


import capstone.capstone.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    @Query("SELECT e FROM Board e WHERE COALESCE(:projectName, '') = '' OR e.projectName = :projectName")
    List<Board> findWithParams(@Param("projectName") String projectName);

    List<Board> findAllByWriter(String memberId);

    List<Board> findAllByBnoIn(List<Long> boardIds);
}