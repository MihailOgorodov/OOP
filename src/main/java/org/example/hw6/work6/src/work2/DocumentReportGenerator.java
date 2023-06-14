package org.example.hw6.work6.src.work2;

// Принцип единой ответственности. В классе две причины, по которым он может быть изменен.

public class DocumentReportGenerator implements ReportGeneratorXml, ReportGeneratorJson {

    @Override
    public String generateXml() {
        String report = "";
        // todo Logic
        return report;
    }

    @Override
    public String generateJson() {
        String report = "";
        // todo Logic
        return report;
    }
}
