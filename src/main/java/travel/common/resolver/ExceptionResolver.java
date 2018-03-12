package travel.common.resolver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


public class ExceptionResolver implements HandlerExceptionResolver {
    
    private HttpServletRequest request;
    private HttpServletResponse response;


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
            Exception exception) {
        this.request = request;
        this.response = response;
        response.setStatus(HttpStatus.OK.value()); // 设置状态码
        response.setCharacterEncoding("UTF-8"); // 避免乱码
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        System.out.println(exception.getMessage());
        //如果是ajax提交
        if(isAjaxSubmit()){
            dealAjaxSubmitException(exception);
        }else{
            //如果不是Ajax提交
            dealFormSubmitException(exception);
        }
        exception.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

    /**判断是否是异步提交*/
    private boolean isAjaxSubmit(){
        return  (request.getHeader("X-Requested-With") != null  
                && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString())) ;
    }
    
    /**获取PrintWriter*/
    private PrintWriter getPrintWriter(){
        try {
            return response.getWriter();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }
    
    /**处理异步提交的异常*/
    private void dealFormSubmitException(Exception exception){
        //保留实现
    }

    /**处理异步提交的异常*/
    private void dealAjaxSubmitException(Exception exception){
        PrintWriter pw=getPrintWriter();
        try {
            pw = response.getWriter();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        response.setContentType(MediaType.TEXT_HTML_VALUE); // ����ContentType
        pw.write(exception.getMessage());
        pw.flush();
        pw.close();
    }


}
