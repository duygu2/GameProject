package MernisServiceAdapter;

import Abstract.PlayerCheckService;
import Entity.Player;
import MernisService.LPNKPSPublicSoap;

import java.rmi.RemoteException;
import java.util.Locale;


public class MernisServiceAdapter implements PlayerCheckService {
    @Override
    public boolean CheckIfRealPerson(Player player) throws Exception {
        LPNKPSPublicSoap soap = new LPNKPSPublicSoap();
        try {
            return soap.TCKimlikNoDogrula(Long.valueOf(player.getNationalityId()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfBirth().getYear());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }
}
