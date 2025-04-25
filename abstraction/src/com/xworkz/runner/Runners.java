package com.xworkz.runner;

import com.xworkz.external.*;
import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc = new OracleJDBC();
        JDBC jdbc1 = new MysqlJDBC();
        RCBApp rcbApp = new RCBApp(jdbc1);

        rcbApp.saveTeamInfo();

        ImageTool basicEnhancer = new BasicEnhancer();
        ImageTool aiEnhancer = new AIEnhancer();
        ImageEditorApp imageEditor = new ImageEditorApp(aiEnhancer);
        imageEditor.enhanceImage();

        LogoEdit simpleResizer = new SimpleResizer();
        LogoEdit smartResizer = new SmartResizer();
        LogoResizerApp logoResizer = new LogoResizerApp(smartResizer);
        logoResizer.resizeLogo();

        PicFix basicSharpener = new BasicSharpener();
        PicFix edgeEnhancer = new EdgeEnhancer();
        PhotoFixerApp photoFixer = new PhotoFixerApp(edgeEnhancer);
        photoFixer.fixPhoto();

        Colorizer autoColorBalancer = new AutoColorBalancer();
        Colorizer vibranceBooster = new VibranceBooster();
        ColorAdjusterApp colorAdjuster = new ColorAdjusterApp(vibranceBooster);
        colorAdjuster.adjustColors();

        BgRemover magicBgRemover = new MagicBgRemover();
        BgRemover manualBgRemover = new ManualBgRemover();
        BackgroundCleanerApp bgCleaner = new BackgroundCleanerApp(magicBgRemover);
        bgCleaner.removeBackground();
    }
}
