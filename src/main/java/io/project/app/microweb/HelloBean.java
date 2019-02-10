
package io.project.app.microweb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;

import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ViewScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String text = "";
        
        public String doSave(){
            System.out.println("Print text " + text);
            return "index";
        }
}
