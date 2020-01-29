package com.tistory.kisspa.communityweb.repository;

import com.tistory.kisspa.communityweb.domain.Board;
import com.tistory.kisspa.communityweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
