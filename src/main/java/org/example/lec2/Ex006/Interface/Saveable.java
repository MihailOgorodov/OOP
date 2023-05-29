package org.example.lec2.Ex006.Interface;

import org.example.lec2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
