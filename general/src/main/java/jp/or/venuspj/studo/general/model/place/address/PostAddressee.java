package jp.or.venuspj.studo.general.model.place.address;

import java.util.Optional;

public class PostAddressee {
    private ZipCode zipCode;
    private Address address;
    private Optional<Addressee> addresseeOptional;
    PostAddressee(){}
    public PostAddressee(ZipCode aZipCode, Address anAddress,Addressee anAddressee){
        zipCode = aZipCode;
        address = anAddress;
        addresseeOptional = Optional.ofNullable(anAddressee);
    }
    AddressInfo addressInfo1(){return address.addressInfo1();}
    AddressInfo addressInfo2(){return address.addressInfo2();}
    public ZipCode zipCode(){
        return zipCode;
    }
    public Optional<Addressee> addresseeOptional(){
        return addresseeOptional;
    }

}
