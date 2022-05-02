package org.wavescale.sourcesync.logger;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;

import javax.swing.*;

/**
 * ****************************************************************************
 * Copyright (c) 2014-2107 Faur Ioan-Aurel.                                     *
 * All rights reserved. This program and the accompanying materials             *
 * are made available under the terms of the MIT License                        *
 * which accompanies this distribution, and is available at                     *
 * http://opensource.org/licenses/MIT                                           *
 * *
 * For any issues or questions send an email at: fioan89@gmail.com              *
 * *****************************************************************************
 */
public class BalloonLogger {

    private BalloonLogger() {
        //
    }

    public static void logBalloonError(final String htmlMessage, final Project project) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StatusBar statusBar = WindowManager.getInstance().getStatusBar(project);
                JBPopupFactory.getInstance().createHtmlTextBalloonBuilder(htmlMessage, MessageType.ERROR, null).
                        setFadeoutTime(7500).createBalloon().show(RelativePoint.getCenterOf(statusBar.getComponent()),
                        Balloon.Position.atRight);
            }
        });
    }

    public static void logBalloonInfo(final String htmlMessage, final Project project) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StatusBar statusBar = WindowManager.getInstance().getStatusBar(project);
                JBPopupFactory.getInstance().createHtmlTextBalloonBuilder(htmlMessage, MessageType.INFO, null).
                        setFadeoutTime(7500).createBalloon().show(RelativePoint.getCenterOf(statusBar.getComponent()),
                        Balloon.Position.atRight);
            }
        });
    }
}
