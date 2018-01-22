package jp.co.tis.tiscon3.controller;

import enkan.data.HttpResponse;
import kotowari.component.TemplateEngine;

import javax.inject.Inject;

/**
 * トップページに関するcontrollerクラス.
 *
 * @author hirano
 */
public class IndexController {

    @Inject
    private TemplateEngine templateEngine;

    /**
     * トップページを表示します.
     *
     * @return トップページresponse
     */
    public HttpResponse index() {
        return templateEngine.render("index");
    }

}
