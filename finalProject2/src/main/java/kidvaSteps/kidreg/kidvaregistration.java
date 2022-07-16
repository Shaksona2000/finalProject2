package kidvaSteps.kidreg;

import SQL.sqlConn;
import kidvaProp.dataregistration;
import kidvaProp.emali;
import kidvaProp.shesavsebi;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.$;

public class kidvaregistration {
    dataregistration data= new dataregistration();
    emali em=new emali();
    sqlConn sq=new sqlConn();
    shesavsebi shes= new shesavsebi();
    public void reg() throws SQLException {
   shes.registration();
           shes.iuridiuli();
           shes.kompania(data.komp);
           shes.IDcode(data.idcode);
           shes.address(data.aaddress);
           shes.city(data.qalaqi);
           shes.posta(data.safostoindex);
           shes.www(data.wwwmiss);
           shes.bank(data.banki);
           shes.BAGAGE(data.angarishi);
           shes.email(data.maill);
           shes.password(data.parol);
           shes.repassword(data.parol);
          sq.db();
           shes.gender();
           shes.date(data.datee);
           shes.ID(data.id);
           shes.mobile(data.mobiluri);
           shes.click();
           shes.exeption();


    }
}
