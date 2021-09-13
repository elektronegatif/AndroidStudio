package com.sefakabatas.landmarkbookjava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.sefakabatas.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    //View Binding
    private ActivityMainBinding binding;
    //ArrayList
    ArrayList<LandMark> landMarksArrayList;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ActivityDetail Initialization
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Initialization
        landMarksArrayList = new ArrayList<>();

        //Data
        LandMark albania = new LandMark(" Name: Golden eagle","Albania", R.drawable.albania,"Offical Status : Yes");
        LandMark angola = new LandMark(" Name: Red-crested turaco","Angola", R.drawable.angola,"Offical Status : Yes");
        LandMark anguilla = new LandMark(" Name: Zenaida dove","Anguilla", R.drawable.anguilla,"Offical Status : Yes");
        LandMark antiguaandBarbuda = new LandMark("Name: Magnificent frigatebird","Antigua and Barbuda", R.drawable.antiguaandbarbuda,"Offical Status : Yes");
        LandMark argentina = new LandMark(" Name: Rufous hornero","Argentina", R.drawable.argentina,"Offical Status : Yes");
        LandMark aruba_1 = new LandMark(" Name: Shoco","Aruba", R.drawable.aruba_1,"Offical Status : Yes");
        LandMark aruba_2 = new LandMark(" Name: Prikichi","Aruba 2", R.drawable.aruba_2,"Offical Status : Yes");
        LandMark austria = new LandMark(" Name: Barn swallow","Austria", R.drawable.austria,"Offical Status : Yes");
        LandMark bahamas = new LandMark(" Name: Flamingo","Bahamas", R.drawable.bahamas,"Offical Status : Yes");
        LandMark bahrain = new LandMark(" Name: White-eared bulbul","Bahrain", R.drawable.bahrain,"Offical Status : Yes");
        LandMark bangladesh = new LandMark(" Name: Oriental magpie-robin (Doyel Pakhi)","Bangladesh", R.drawable.bangladesh,"Offical Status : Yes");
        LandMark belgium = new LandMark(" Name: Common kestrel","Belgium", R.drawable.belgium,"Offical Status : Yes");
        LandMark belize = new LandMark(" Name: Keel-billed toucan","Belize", R.drawable.belize,"Offical Status : Yes");
        LandMark bhutan = new LandMark(" Name: Common raven","Bhutan", R.drawable.bhutan,"Offical Status : Yes");
        LandMark bolivia = new LandMark(" Name: Andean condor","Bolivia", R.drawable.bolivia,"Offical Status : Yes");
        LandMark botswana = new LandMark(" Name: Kori bustard","Botswana", R.drawable.botswana,"Offical Status : Yes");
        LandMark brazil = new LandMark(" Name: Rufous-bellied thrush","Brazil", R.drawable.brezail,"Offical Status : Yes");
        LandMark britishVirginIslands = new LandMark(" Mourning dove","British Virgin Islands", R.drawable.britishvirginislands,"Offical Status : Yes");
        LandMark cambodia = new LandMark(" Name: Giant ibis","Cambodia", R.drawable.cambodia,"Offical Status : Yes");
        LandMark CaymanIslands = new LandMark(" Name: Grand Cayman parrot","Cayman Islands", R.drawable.caymanislands,"Offical Status : Yes");
        LandMark Chile = new LandMark(" Name: Andean condor","Chile", R.drawable.chile,"Offical Status : Yes");
        LandMark Colombia = new LandMark(" Name: Andean condor","Colombia", R.drawable.colombia,"Offical Status : Yes");
        LandMark CostaRica = new LandMark(" Name: Clay-colored thrush","Costa Rica", R.drawable.costarica,"Offical Status : Yes");
        LandMark Cuba = new LandMark(" Name: Cuban trogon","Cuba", R.drawable.cuba,"Offical Status : Yes");
        LandMark Denmark = new LandMark(" Name: Eurasian skylark (1960–1984)","Denmark 1", R.drawable.denmark_1,"Offical Status : Yes");
        LandMark Denmark2 = new LandMark(" Name: Mute swan (1984–)","Denmark 2", R.drawable.denmark_2,"Offical Status : Yes");
        LandMark Dominica = new LandMark(" Name: Imperial amazon","Dominica", R.drawable.dominica,"Offical Status : Yes");
        LandMark DominicanRepublic = new LandMark(" Name: Palmchat","Dominican Republic", R.drawable.dominicanrepublic,"Offical Status : Yes");
        LandMark Ecuador = new LandMark(" Name: Andean condor","Ecuador", R.drawable.ecuador,"Offical Status : Yes");
        LandMark ElSalvador = new LandMark(" Name: Turquoise-browed motmot","El Salvador", R.drawable.elsalvador,"Offical Status : Yes");
        LandMark Estonia = new LandMark(" Name: Barn swallow","Estonia", R.drawable.estonia,"Offical Status : Yes");
        LandMark Eswatini = new LandMark(" Name: Purple-crested turaco","Eswatini", R.drawable.eswatini,"Offical Status : Yes");
        LandMark FaroeIslands = new LandMark(" Name: Eurasian oystercatcher","Faroe Islands", R.drawable.faroeislands,"Offical Status : Yes");
        LandMark Gibraltar = new LandMark(" Name: Barbary partridge","Gibraltar", R.drawable.gibraltar,"Offical Status : Yes");
        LandMark Grenada = new LandMark(" Name: Grenada dove","Grenada", R.drawable.grenada,"Offical Status : Yes");
        LandMark Guatemala = new LandMark(" Name: Resplendent quetzal","Guatemala", R.drawable.guatemala,"Offical Status : Yes");
        LandMark Guyana = new LandMark(" Name: Hoatzin","Guyana", R.drawable.guyana,"Offical Status : Yes");
        LandMark Haiti = new LandMark(" Name: Hispaniolan trogon","Haiti", R.drawable.haiti,"Offical Status : Yes");
        LandMark Honduras = new LandMark(" Name: Scarlet macaw","Honduras", R.drawable.honduras,"Offical Status : Yes");
        LandMark Hungary = new LandMark(" Name: Saker falcon","Hungary", R.drawable.hungary,"Offical Status : Yes");
        LandMark Iceland = new LandMark(" Name: Golden plover","Iceland", R.drawable.iceland,"Offical Status : Yes");
        LandMark India = new LandMark(" Name: Indian peacock","India", R.drawable.india,"Offical Status : Yes");
        LandMark Indonesia = new LandMark(" Name: Javan hawk-eagle","Indonesia", R.drawable.indonesia,"Offical Status : Yes");
        LandMark Iran = new LandMark(" Name: Common nightingale","Iran", R.drawable.iran,"Offical Status : Yes");
        LandMark Israel = new LandMark(" Name: Hoopoe","Israel", R.drawable.israel,"Offical Status : Yes");
        LandMark Jamaica = new LandMark(" Name: Doctor bird","Jamaica", R.drawable.jamaica,"Offical Status : Yes");
        LandMark Japan = new LandMark(" Name: Green pheasant","Japan", R.drawable.japan,"Offical Status : Yes");
        LandMark Jordan = new LandMark(" Name: Sinai rosefinch","Jordan", R.drawable.jordan,"Offical Status : Yes");
        LandMark Latvia = new LandMark(" Name: White wagtail","Latvia", R.drawable.latvia,"Offical Status : Yes");
        LandMark Liberia = new LandMark(" Name: Garden bulbul","Liberia", R.drawable.liberia,"Offical Status : Yes");
        LandMark Lithuania = new LandMark(" Name: White stork","Lithuania", R.drawable.lithuania,"Offical Status : Yes");
        LandMark Luxembourg = new LandMark(" Name: Goldcrest","Luxembourg", R.drawable.luxembourg,"Offical Status : Yes");
        LandMark Malaysia = new LandMark(" Name: Rhinoceros hornbill","Malaysia", R.drawable.malaysia,"Offical Status : Yes");
        LandMark Malta = new LandMark(" Name: Blue rock thrush","Malta", R.drawable.malta,"Offical Status : Yes");
        LandMark Mexico = new LandMark(" Name: Golden eagle","Mexico", R.drawable.mexico,"Offical Status : Yes");
        LandMark Mongolia = new LandMark(" Name: Saker falcon","Mongolia", R.drawable.mongolia,"Offical Status : Yes");
        LandMark Montserrat = new LandMark(" Name: Montserrat oriole","Montserrat", R.drawable.montserrat,"Offical Status : Yes");
        LandMark Nepal = new LandMark(" Name: Himalayan monal","Nepal", R.drawable.nepal,"Offical Status : Yes");
        LandMark NewZealand = new LandMark(" Name: Kiwi","New Zealand", R.drawable.newzealand,"Offical Status : Yes");
        LandMark Nicaragua = new LandMark(" Name: Turquoise-browed motmot","Nicaragua", R.drawable.nicaragua,"Offical Status : Yes");
        LandMark Nigeria = new LandMark(" Name: Black crowned crane","Nigeria", R.drawable.nigeria,"Offical Status : Yes");
        LandMark NorthKorea = new LandMark(" Name: Northern goshawk","North Korea", R.drawable.northkorea,"Offical Status : Yes");
        LandMark Norway = new LandMark(" Name: White-throated dipper","Norway", R.drawable.norway,"Offical Status : Yes");
        LandMark Pakistan = new LandMark(" Name: Chukar partridge","Pakistan", R.drawable.pakistan_1,"Offical Status : Yes");
        LandMark Panama = new LandMark(" Name: Harpy eagle","Panama", R.drawable.panama,"Offical Status : Yes");
        LandMark PapuaNewGuinea = new LandMark(" Name: Raggiana bird-of-paradise","Papua New Guinea", R.drawable.papuanewguinea,"Offical Status : Yes");
        LandMark Paraguay = new LandMark(" Name: Bare-throated bellbird","Paraguay", R.drawable.paraguay,"Offical Status : Yes");
        LandMark Peru = new LandMark(" Name: Andean cock-of-the-rock","Peru", R.drawable.peru,"Offical Status : Yes");
        LandMark Philippines = new LandMark(" Name: Philippine eagle","Philippines", R.drawable.philippines,"Offical Status : Yes");
        LandMark Poland = new LandMark(" Name: White-tailed eagle (national bird)","Poland 1 ", R.drawable.poland_1,"Offical Status : Yes");
        LandMark SaintHelena = new LandMark(" Name: Saint Helena plover","Saint Helena", R.drawable.sainthelena,"Offical Status : Yes");
        LandMark SaintKittsandNevis = new LandMark(" Name: Brown pelican","Saint Kitts and Nevis", R.drawable.saintkittsandnevis,"Offical Status : Yes");
        LandMark SaintLucia = new LandMark(" Name: Saint Lucia amazon","Saint Lucia", R.drawable.saintlucia,"Offical Status : Yes");
        LandMark SaintVincentandtheGrenadines = new LandMark(" Name: St Vincent parrot","Saint Vincent and the Grenadines", R.drawable.saintvincentandthegrenadines,"Offical Status : Yes");
        LandMark Serbia = new LandMark(" Name: Golden eagle","Serbia 1", R.drawable.serbia_1,"Offical Status : Yes");
        LandMark Serbia2 = new LandMark(" Name: Griffon vulture","Serbia 2", R.drawable.serbia_2,"Offical Status : Yes");
        LandMark SouthAfrica = new LandMark(" Name: Blue crane","South Africa", R.drawable.southafrica,"Offical Status : Yes");
        LandMark SriLanka = new LandMark(" Name: Sri Lanka junglefowl","Sri Lanka", R.drawable.srilanka,"Offical Status : Yes");
        LandMark Thailand = new LandMark(" Name: Siamese fireback","Thailand", R.drawable.thailand,"Offical Status : Yes");
        LandMark Uganda = new LandMark(" Name: East African crowned crane","Uganda", R.drawable.uganda,"Offical Status : Yes");
        LandMark UnitedArabEmirates = new LandMark(" Name: Peregrine falcon","United Arab Emirates", R.drawable.unitedarabemirates,"Offical Status : Yes");
        LandMark UnitedStates = new LandMark(" Name: Bald eagle","United States", R.drawable.unitedstates,"Offical Status : Yes");
        LandMark Venezuela = new LandMark(" Name: Venezuelan troupial","Venezuela", R.drawable.venezuela,"Offical Status : Yes");
        LandMark Zambia = new LandMark(" Name: African fish eagle","Zambia", R.drawable.zambia,"Offical Status : Yes");
        LandMark Belarus = new LandMark(" Name: White stork","Belarus", R.drawable.belarus,"Offical Status : No");
        LandMark Bermuda = new LandMark(" Name: Bermuda petrel","Bermuda", R.drawable.bermuda,"Offical Status : No");
        LandMark Canada = new LandMark(" Name: Canada jay","Canada", R.drawable.canada,"Offical Status : No");
        LandMark China = new LandMark(" Name: Red-crowned crane","China", R.drawable.china,"Offical Status : No");
        LandMark Croatia = new LandMark(" Name: Common nightingale","Croatia", R.drawable.croatia,"Offical Status : No");
        LandMark Finland = new LandMark(" Name: Whooper swan","Finland", R.drawable.finland,"Offical Status : No");
        LandMark France = new LandMark(" Name: Gallic rooster","France", R.drawable.france,"Offical Status : No");
        LandMark Germany = new LandMark(" Name: Eagle","France", R.drawable.germany,"Offical Status : No");
        LandMark Ireland = new LandMark(" Name: Northern lapwing","Ireland", R.drawable.ireland,"Offical Status : No");
        LandMark Italy = new LandMark(" Name: Italian sparrow","Italy", R.drawable.italy,"Offical Status : No");
        LandMark Kenya = new LandMark(" Name: Lilac-breasted roller","Kenya", R.drawable.kenya,"Offical Status : No");
        LandMark Myanmar = new LandMark(" Name: Grey peacock-pheasant","Myanmar", R.drawable.myanmar,"Offical Status : No");
        LandMark Netherlands = new LandMark(" Name: Black-tailed godwit","Netherlands", R.drawable.netherlands,"Offical Status : No");
        LandMark NorthernIreland = new LandMark(" Name: Eurasian oystercatcher","Northern Ireland", R.drawable.northernireland,"Offical Status : No");
        LandMark Pakistan2 = new LandMark(" Name: Shaheen falcon (Heritage bird)","Pakistan 2", R.drawable.pakistan_2,"Offical Status : No");
        LandMark Palestine = new LandMark(" Name: Palestine sunbird","Palestine", R.drawable.palestine,"Offical Status : No");
        LandMark Poland2 = new LandMark(" Name: White stork (national bird)","Poland", R.drawable.poland_2,"Offical Status : No");
        LandMark PuertoRico = new LandMark(" Name: Puerto Rican spindalis","Puerto Rico", R.drawable.puertorico,"Offical Status : No");
        LandMark Scotland = new LandMark(" Name: Golden eagle","Scotland", R.drawable.scotland,"Offical Status : No");
        LandMark Singapore = new LandMark(" Name: Crimson sunbird","Singapore", R.drawable.singapore,"Offical Status : No");
        LandMark SouthKorea = new LandMark(" Name: Korean magpie","South Korea", R.drawable.southkorea,"Offical Status : No");
        LandMark Sweden = new LandMark(" Name: Common blackbird","Sweden", R.drawable.sweden,"Offical Status : No");
        LandMark Taiwan = new LandMark(" Name: Taiwan blue magpie","Taiwan", R.drawable.taiwan,"Offical Status : No");
        LandMark Ukraine = new LandMark(" Name: White stork","Ukraine", R.drawable.ukraine,"Offical Status : No");
        LandMark UnitedKingdom = new LandMark(" Name: European robin","United Kingdom", R.drawable.unitedkingdom,"Offical Status : No");
        LandMark Uruguay = new LandMark(" Name: Southern lapwing","Uruguay", R.drawable.uruguay,"Offical Status : No");
        LandMark Wales = new LandMark(" Name: Red Kite","Wales", R.drawable.wales,"Offical Status : No");

        //Add
        landMarksArrayList.add(albania);landMarksArrayList.add(angola);landMarksArrayList.add(anguilla);landMarksArrayList.add(antiguaandBarbuda);
        landMarksArrayList.add(argentina);landMarksArrayList.add(aruba_1);landMarksArrayList.add(aruba_2);landMarksArrayList.add(austria);
        landMarksArrayList.add(bahamas);landMarksArrayList.add(bahrain);landMarksArrayList.add(bangladesh);landMarksArrayList.add(belgium);
        landMarksArrayList.add(belize);landMarksArrayList.add(bhutan);landMarksArrayList.add(bolivia);landMarksArrayList.add(botswana);
        landMarksArrayList.add(brazil);landMarksArrayList.add(britishVirginIslands);landMarksArrayList.add(cambodia);landMarksArrayList.add(CaymanIslands);
        landMarksArrayList.add(Chile);landMarksArrayList.add(Colombia);landMarksArrayList.add(CostaRica);landMarksArrayList.add(Cuba);
        landMarksArrayList.add(Denmark);landMarksArrayList.add(Denmark2);landMarksArrayList.add(Dominica);
        landMarksArrayList.add(DominicanRepublic);landMarksArrayList.add(Ecuador);landMarksArrayList.add(ElSalvador);landMarksArrayList.add(Estonia);
        landMarksArrayList.add(Estonia);landMarksArrayList.add(Eswatini);landMarksArrayList.add(FaroeIslands);landMarksArrayList.add(Gibraltar);
        landMarksArrayList.add(Grenada);landMarksArrayList.add(Guatemala);landMarksArrayList.add(Haiti);landMarksArrayList.add(Honduras);
        landMarksArrayList.add(Hungary);landMarksArrayList.add(Iceland);landMarksArrayList.add(India);landMarksArrayList.add(Indonesia);landMarksArrayList.add(Iran);
        landMarksArrayList.add(Israel);landMarksArrayList.add(Jamaica);landMarksArrayList.add(Japan);landMarksArrayList.add(Jordan);
        landMarksArrayList.add(Latvia);landMarksArrayList.add(Liberia);landMarksArrayList.add(Lithuania);landMarksArrayList.add(Luxembourg);
        landMarksArrayList.add(Malaysia);landMarksArrayList.add(Malta);landMarksArrayList.add(Mexico);landMarksArrayList.add(Mongolia);landMarksArrayList.add(Montserrat);
        landMarksArrayList.add(Nepal);landMarksArrayList.add(NewZealand);landMarksArrayList.add(Nicaragua);landMarksArrayList.add(Nigeria);
        landMarksArrayList.add(NorthKorea);landMarksArrayList.add(Norway);landMarksArrayList.add(Pakistan);landMarksArrayList.add(Panama);
        landMarksArrayList.add(PapuaNewGuinea);landMarksArrayList.add(Paraguay);landMarksArrayList.add(Peru);landMarksArrayList.add(Philippines);
        landMarksArrayList.add(Poland);landMarksArrayList.add(SaintHelena);landMarksArrayList.add(SaintKittsandNevis);landMarksArrayList.add(SaintLucia);
        landMarksArrayList.add(SaintVincentandtheGrenadines);landMarksArrayList.add(Serbia);landMarksArrayList.add(Serbia2);landMarksArrayList.add(SouthAfrica);
        landMarksArrayList.add(Thailand);landMarksArrayList.add(Uganda);landMarksArrayList.add(UnitedArabEmirates);landMarksArrayList.add(UnitedStates);
        landMarksArrayList.add(Zambia);landMarksArrayList.add(Belarus);landMarksArrayList.add(Bermuda);
        landMarksArrayList.add(Canada);landMarksArrayList.add(China);landMarksArrayList.add(Croatia);landMarksArrayList.add(Finland);
        landMarksArrayList.add(France);landMarksArrayList.add(Germany);
        landMarksArrayList.add(Ireland);landMarksArrayList.add(Italy);landMarksArrayList.add(Kenya);landMarksArrayList.add(Netherlands);
        landMarksArrayList.add(NorthernIreland);landMarksArrayList.add(Venezuela);landMarksArrayList.add(Myanmar);landMarksArrayList.add(Pakistan2);
        landMarksArrayList.add(Palestine);landMarksArrayList.add(Poland2);landMarksArrayList.add(PuertoRico);landMarksArrayList.add(Scotland);
        landMarksArrayList.add(Singapore);landMarksArrayList.add(SouthKorea);landMarksArrayList.add(Sweden);landMarksArrayList.add(Taiwan);
        landMarksArrayList.add(Ukraine);landMarksArrayList.add(UnitedKingdom);landMarksArrayList.add(Uruguay);landMarksArrayList.add(Wales);

        //Adapter
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BirdMarkAdaptor birdMarkAdaptor = new BirdMarkAdaptor(landMarksArrayList);
        binding.recyclerView.setAdapter(birdMarkAdaptor);





    }
}