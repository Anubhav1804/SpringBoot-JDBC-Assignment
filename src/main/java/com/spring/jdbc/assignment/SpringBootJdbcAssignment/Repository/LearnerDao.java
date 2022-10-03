package com.spring.jdbc.assignment.SpringBootJdbcAssignment.Repository;


import com.spring.jdbc.assignment.SpringBootJdbcAssignment.Entity.Learner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LearnerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // INSERT ROW
    public int insertLearner(Learner learner) {
        String insertLearnerQuery = "INSERT INTO Learner VALUES(?, ?, ?, ?, ?, ?)";
        // will return 1 after success
        return jdbcTemplate.update(insertLearnerQuery ,new Object[]{learner.getId(), learner.getFirstName(),
                learner.getLastName(), learner.getEmail(), learner.getPassword(), learner.getCourseId()});
    }

    // READ TABLE (ALL ROWS)
    public List<Learner> getAllLearner() {
        String getLearnerQuery = "SELECT * FROM Learner";
        return jdbcTemplate.query(getLearnerQuery, new BeanPropertyRowMapper<Learner>(Learner.class));
    }

    // READ TABLE (UNIQUE ROW)
    public Learner getLearnerById(int id) {
        String getLearnerByIdQuery = "SELECT * FROM Learner WHERE Id = ?";
        return jdbcTemplate.queryForObject(getLearnerByIdQuery, new BeanPropertyRowMapper<Learner>(Learner.class),
                new Object[] {id});
    }

    // UPDATE ROW
    public int updateLearner(Learner learner){
        String updateQuery = "UPDATE Learner "+" SET LastName = ?, Password = ?, Course_Id = ?"+
                "WHERE Id = ?";
        return jdbcTemplate.update(updateQuery, new Object[]{learner.getLastName(), learner.getPassword(),
                learner.getCourseId(), learner.getId()});
    }

    // Delete Operation
    public int deleteLearner(int id){
        String deleteQuery = "DELETE FROM Learner "+" WHERE Id = ?";
        return jdbcTemplate.update(deleteQuery, new Object[]{id});
    }
}
