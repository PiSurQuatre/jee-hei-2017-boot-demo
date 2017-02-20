package boot.hei.demo.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "hei")
public class HEIProperties {

    private String mostDifficult;

    private String favoriteStudent;

    private long bestGrade;


    public HEIProperties() {
    }


    public String getMostDifficult() {
        return mostDifficult;
    }


    public void setMostDifficult(final String mostDifficultValue) {
        mostDifficult = mostDifficultValue;
    }


    public String getFavoriteStudent() {
        return favoriteStudent;
    }


    public void setFavoriteStudent(final String favoriteStudentValue) {
        favoriteStudent = favoriteStudentValue;
    }


    public long getBestGrade() {
        return bestGrade;
    }


    public void setBestGrade(final long bestGradeValue) {
        bestGrade = bestGradeValue;
    }
}
