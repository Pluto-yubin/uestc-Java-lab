package Lab;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class Controller implements Initializable {


    @FXML
    private TextField cou_chour;

    @FXML
    private Button check_button;

    @FXML
    private Button sch_continue;

    @FXML
    private Button stu_continue;

    @FXML
    private TextField tea_sex;

    @FXML
    private TextField stu_age;

    @FXML
    private Button ele_continue;

    @FXML
    private TextField tea_name;

    @FXML
    private TextField sch_classid;

    @FXML
    private Tab cou_tab;

    @FXML
    private TextField tea_tid;

    @FXML
    private TextField ele_classid;

    @FXML
    private Button tea_continue;

    @FXML
    private TextField sch_cid;

    @FXML
    private Tab tea_tab;

    @FXML
    private TextField cou_cid;

    @FXML
    private Button cou_continue;

    @FXML
    private TextField sch_classroom;

    @FXML
    private TextField stu_sex;

    @FXML
    private TextField stu_major;

    @FXML
    private Tab ele_tab;

    @FXML
    private TextField sch_tid;

    @FXML
    private TextField tea_title;

    @FXML
    private Tab sch_tab;

    @FXML
    private TextField cou_cname;



    @FXML
    private TextField ele_sid;



    @FXML
    private Tab stu_tab;

    @FXML
    private TextField ele_elid;

    @FXML
    private TextField stu_name;

    @FXML
    private TextField find_sid;

    @FXML
    private TextField show_cname;

    @FXML
    private TextField show_tid;

    @FXML
    private TextField show_classroom;

    @FXML
    private TextField stu_sid;

    @FXML
    private TextField tea_age;


    private int i = 0;
    String judge = new String();

    public Controller() throws IOException {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO (don't really need to do anything here).

    }

    public static void showClass(ActionEvent event) {

    }

    public String setStu_name() {
        System.out.println("Stu_name: "+stu_name.getText());
        return stu_name.getText();
    }
    public int setStu_age() {
        return Integer.parseInt(stu_age.getText());
    }
    public String setStu_sex() {
        return stu_sex.getText();
    }

    public String setStu_sid() {
        return stu_sid.getText();
    }
    public String setStu_major() {
        return stu_major.getText();
    }

    public void setStu_continue(ActionEvent event) {

 //       stu_continue.setOnAction((ActionEvent e) ->{
            judge = "N";
            Myfile studnets_file = null;
            try {
                studnets_file = new Myfile(new File("Students.txt"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            for(int j = 0; j < studnets_file.students.length; j++)
                studnets_file.students[j] = new Student(null, null, 0, null, null);

            studnets_file.students[i].setName(setStu_name());
            studnets_file.students[i].setAge(setStu_age());
            studnets_file.students[i].setSex(setStu_sex());
            studnets_file.students[i].setSid(setStu_sid());
            studnets_file.students[i].setMajor(setStu_major());
            studnets_file.students[i].display();

            try {
                studnets_file.Writefile(studnets_file.students[i]);
                i++;
                studnets_file.readfile(studnets_file.students);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }

 //       });
        stu_major.setText("");
        stu_name.setText("");
        stu_age.setText("");
        stu_sex.setText("");
        stu_sid.setText("");
    }


    public String setTea_name() {
        return tea_name.getText();
    }

    public int setTea_age() {
        return Integer.parseInt(tea_age.getText());
    }

    public String setTea_sex() {
        return tea_sex.getText();
    }

    public String setTea_tid() {
        return tea_tid.getText();
    }

    public String  setTea_title() {
        return tea_title.getText();
    }
    Myfile teachers_file = new Myfile(new File("Teachers.txt"));
    public void setTea_continue() {
//        System.out.println("start");
        i = 0;
//        tea_continue.setOnAction((ActionEvent e) -> {
            judge = "N";

            for(int j = 0; j < teachers_file.teachers.length; j++)
                teachers_file.teachers[j] = new Teacher(null, null, 0, null, null);

            teachers_file.teachers[i].setName(setTea_name());
            System.out.println(setTea_name());
            teachers_file.teachers[i].setAge(setTea_age());
            teachers_file.teachers[i].setSex(setTea_sex());
            teachers_file.teachers[i].setTid(setTea_tid());
            teachers_file.teachers[i].setTitle(setTea_title());
            teachers_file.teachers[i].display();

            try {
                teachers_file.Writefile(teachers_file.teachers[i]);
                i++;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
 //       });
        tea_name.setText("");
        tea_title.setText("");
        tea_tid.setText("");
        tea_sex.setText("");
        tea_age.setText("");
    }



    public String setCou_cname() {
        return cou_cname.getText();
    }

    public String setCou_cid( ) {
        return cou_cid.getText();
    }

    public int setCou_chour() {
        return Integer.parseInt(cou_chour.getText());
    }
    Myfile cou_file = new Myfile(new File("Courses.txt"));
    public void setCou_continue() {
//        System.out.println("start");
        i = 0;
//        cou_continue.setOnAction((ActionEvent e) -> {
            judge = "N";
            for(int j = 0; j < cou_file.courses.length; j++)
                cou_file.courses[j] = new Course(null, null, 0);

            cou_file.courses[i].setCname(setCou_cname());
            cou_file.courses[i].setChour(setCou_chour());
            cou_file.courses[i].setCid(setCou_cid());
            cou_file.courses[i].display();

            try {
                cou_file.Writefile(cou_file.courses[i]);
                i++;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
  //      });
        cou_cname.setText("");
        cou_chour.setText("");
        cou_cid.setText("");
    }

    public String setSch_cid( ) {
        return sch_cid.getText();
    }

    public String setSch_classid( ) {
        return sch_classid.getText();
    }

    public String setSch_classroom( ) {
        return sch_classroom.getText();
    }

    public String setSch_tid( ) {
        return sch_tid.getText();
    }
    Myfile schedules_file = new Myfile(new File("Schedule.txt"));
    public void setSch_continue() {
        System.out.println("start");
        i = 0;
//        sch_continue.setOnAction((ActionEvent e) -> {
            judge = "N";
            for(int j = 0; j < schedules_file.schedules.length; j++)
                schedules_file.schedules[j] = new Schedule(null, null, null, null);

            schedules_file.schedules[i].setCid(setSch_cid());
            System.out.println(setSch_cid());
            schedules_file.schedules[i].setClassid(setSch_classid());
            schedules_file.schedules[i].setClassrome(setSch_classroom());
            schedules_file.schedules[i].setTid(setSch_tid());
            schedules_file.schedules[i].display();

            try {
                schedules_file.Writefile(schedules_file.schedules[i]);
                i++;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
 //       });
        sch_tid.setText("");
        sch_classroom.setText("");
        sch_classid.setText("");
        sch_cid.setText("");

    }


    public String setEle_elid() {
        return ele_elid.getText();
    }

    public String setEle_classid() {
        return ele_classid.getText();
    }

    public String setEle_sid() {
        return ele_sid.getText();
    }

    Myfile elec_file =new Myfile(new File("elec.txt"));

    public void setEle_continue() {
        System.out.println("start");
        i = 0;
 //       ele_continue.setOnAction((ActionEvent e) -> {
            judge = "N";

            for(int j = 0; j < elec_file.electivecourses.length; j++)
                elec_file.electivecourses[j] = new Electivecourse(null, null, null);

            elec_file.electivecourses[i].setClassid(setEle_classid());
            System.out.println(setEle_classid());
            elec_file.electivecourses[i].setElid(setEle_elid());
            elec_file.electivecourses[i].setSid(setEle_sid());
            elec_file.electivecourses[i].display();

            try {
                elec_file.Writefile(elec_file.electivecourses[i]);
                i++;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
 //       });
        ele_sid.setText("");
        ele_classid.setText("");
        ele_elid.setText("");

    }
    public void check() throws IOException, ClassNotFoundException {

        elec_file.readfile(elec_file.electivecourses);
        cou_file.readfile(cou_file.courses);
        schedules_file.readfile(schedules_file.schedules);
        teachers_file.readfile(teachers_file.teachers);
//        System.out.println("TEST");
        String sid = find_sid.getText();
        for(int i = 0; i < 5; i++) {          // 通过学号来找选课类
            if(sid.compareTo(elec_file.electivecourses[i].getSid()) == 0 ) {
                for(int j = 0; j < 5; j++) {         //通过选课类中的classid找schedule， 输出schedule中的classroom
                    if(elec_file.electivecourses[i].getClassid().compareTo(schedules_file.schedules[j].getClassid()) == 0) {
                        show_classroom.setText(schedules_file.schedules[j].getClassrome());
                        for(int k = 0; k < 5; k++) {           //通过schedule中的cid找course
                            if(schedules_file.schedules[j].getCid().compareTo(cou_file.courses[k].getCid()) == 0) {
                                show_cname.setText(cou_file.courses[k].getCname());
                            }
                        }
                        for(int k = 0; k < 5; k++ ) {     //通过schedule中的tid找teacher
                            if(schedules_file.schedules[j].getTid().compareTo(teachers_file.teachers[k].getTid()) == 0) {
                                show_tid.setText(teachers_file.teachers[k].getName());
                            }
                        }
                    }
                }
            }
        }
    }
}
