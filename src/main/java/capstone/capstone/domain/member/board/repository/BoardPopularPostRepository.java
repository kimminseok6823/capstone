package capstone.capstone.domain.member.board.repository;


import capstone.capstone.domain.member.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardPopularPostRepository extends JpaRepository<Board,Long> {
    @Query("SELECT b FROM Board b ORDER BY b.boardLike DESC")
    Page<Board> findByBoardPopularPost(Pageable pageable);
}
