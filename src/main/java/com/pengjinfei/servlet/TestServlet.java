package com.pengjinfei.servlet;

import java.io.*;

/**
 * Created by Pengjinfei on 16/5/19.
 * Description:
 */
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String path = request.getServletContext().getRealPath("/WEB-INF/Aerial02.jpg");
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        BufferedOutputStream bout = new BufferedOutputStream(
                response.getOutputStream());
        try {
            byte b[] = new byte[1024];
            int len = in.read(b);
            while (len > 0) {
                bout.write(b, 0, len);
                len = in.read(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bout.close();
            in.close();
        }
    }
}
