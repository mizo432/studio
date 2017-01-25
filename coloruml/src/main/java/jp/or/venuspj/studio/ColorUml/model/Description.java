package jp.or.venuspj.studio.ColorUml.model;

import java.util.Optional;

public interface Description<PPT extends Ppt> {
    Ppts<PPT> partyPlaceThings();

    Optional<Assess> assess();

}
