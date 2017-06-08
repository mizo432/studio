package jp.or.venuspj.studio.adapter.presenters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Contoroller {
    Presenter hogehogePresentor;
    UseCaseInteractor useCaseInteractor;

    @Autowired
    public Contoroller(Presenter aHogehogePresentor,UseCaseInteractor anUseCaseInteractor){
        useCaseInteractor = anUseCaseInteractor;
        hogehogePresentor = aHogehogePresentor;

    }

    public void get(Integer arg){
        UseCaseInputPort useCaseInputPort = createUseCaseInputPort();
        useCaseInteractor.withInputPort(useCaseInputPort, hogehogePresentor).start();
        HogeHogeForm aaaa = hogehogePresentor.getHogeHogeForm();
    }

    private UseCaseInputPort createUseCaseInputPort() {
        return new UseCaseInputPort();
    }

}
