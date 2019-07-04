package com.springEtl.springbatchetl;

import com.springEtl.springbatchetl.model.DataModel;
import org.joda.time.LocalDate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRowMapper implements RowMapper<DataModel>{

    @Override
    public DataModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        DataModel result = new DataModel();
        result.setStudentName(rs.getString("student_name"));
        result.setDob(new LocalDate(rs.getDate("dob")));
        result.setPercentage(rs.getDouble("percentage"));

        return result;
    }
}
