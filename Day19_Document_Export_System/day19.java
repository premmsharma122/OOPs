abstract class Document {

    private String fileName;
    private String extension;

    Document(String fileName, String extension) {
        this.fileName = fileName;
        this.extension = extension;
    }

    abstract void export();

    void displayDocumentInfo() {
        System.out.println("File Name : " + fileName);
        System.out.println("Extension : " + extension);
    }
}

class PDFDocument extends Document {

    PDFDocument(String fileName, String extension) {
        super(fileName, extension);
    }

    @Override
    void export() {
        System.out.println("Exporting PDF Document...");
    }
}

class ExcelDocument extends Document {

    ExcelDocument(String fileName, String extension) {
        super(fileName, extension);
    }

    @Override
    void export() {
        System.out.println("Exporting Excel Document...");
    }
}

class CSVDocument extends Document {

    CSVDocument(String fileName, String extension) {
        super(fileName, extension);
    }

    @Override
    void export() {
        System.out.println("Exporting CSV Document...");
    }
}

class DocumentFactory {

    static Document getDocument(String type) {

        if (type.equalsIgnoreCase("PDF")) {
            return new PDFDocument("Report", ".pdf");
        }

        else if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument("EmployeeData", ".xlsx");
        }

        else if (type.equalsIgnoreCase("CSV")) {
            return new CSVDocument("Sales", ".csv");
        }

        System.out.println("Invalid Document Type");
        return null;
    }
}

public class day19 {

    public static void main(String[] args) {

        Document d1 = DocumentFactory.getDocument("PDF");

        if (d1 != null) {
            d1.export();
            d1.displayDocumentInfo();
        }

        System.out.println();

        Document d2 = DocumentFactory.getDocument("CSV");

        if (d2 != null) {
            d2.export();
            d2.displayDocumentInfo();
        }

        System.out.println();

        Document d3 = DocumentFactory.getDocument("EXCEL");

        if (d3 != null) {
            d3.export();
            d3.displayDocumentInfo();
        }

        System.out.println();

        Document d4 = DocumentFactory.getDocument("WORD");

        if (d4 != null) {
            d4.export();
            d4.displayDocumentInfo();
        }
    }
}