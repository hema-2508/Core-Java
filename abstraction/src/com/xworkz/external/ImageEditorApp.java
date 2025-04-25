package com.xworkz.external;

import com.xworkz.internal.ImageTool;

public class ImageEditorApp {
    private ImageTool imageTool;

    public ImageEditorApp(ImageTool imageTool) {
        this.imageTool = imageTool;
    }

    public void enhanceImage() {
        System.out.println("Running enhanceImage in ImageEditorApp");
        if (imageTool != null) {
            this.imageTool.enhance();
        } else {
            System.out.println("ImageTool is null");
        }
    }
}