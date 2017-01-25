package jp.or.venuspj.studio.ColorUml.model;

import java.util.Optional;

public interface MomentInterval {

    MomentIntervalDetails momentIntervalDetails();

    Optional<MomentInterval> actual();

    MomentIntervals plans();

}
