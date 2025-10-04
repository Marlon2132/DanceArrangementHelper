module com.github.marlon2132.dancearrangementhelper {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.github.marlon2132.dancearrangementhelper to javafx.fxml;
    exports com.github.marlon2132.dancearrangementhelper;
}