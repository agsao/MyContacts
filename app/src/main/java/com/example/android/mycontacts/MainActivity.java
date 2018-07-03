package com.example.android.mycontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//String[] contactsNames=new String[10];
//
//        contactsNames[0]="Ahmed1";
//        contactsNames[1]="Ahmed2";
//        contactsNames[2]="Ahmed3";
//        contactsNames[3]="Ahmed4";
//        contactsNames[100]="Ahmed100";

        final ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Ahmed1", "00-000-0001"));
        contacts.add(new Contact("Ahmed2", "00-000-0002",R.drawable.contact_2));
        contacts.add(new Contact("Ahmed3", "00-000-0003"));
        contacts.add(new Contact("Ahmed4", "00-000-0004"));
        contacts.add(new Contact("Ahmed5", "00-000-0005"));
        contacts.add(new Contact("Ahmed6", "00-000-0006",R.drawable.contact_6));
        contacts.add(new Contact("Ahmed7", "00-000-0007"));
        contacts.add(new Contact("Ahmed8", "00-000-0008"));
        contacts.add(new Contact("Ahmed9", "00-000-0009"));
        contacts.add(new Contact("Ahmed10", "00-000-0010"));
        contacts.add(new Contact("Ahmed11", "00-000-0011",R.drawable.contact_11));
        contacts.add(new Contact("Ahmed12", "00-000-0012"));
        contacts.add(new Contact("Ahmed13", "00-000-0013"));
        contacts.add(new Contact("Ahmed14", "00-000-0014"));
        contacts.add(new Contact("Ahmed15", "00-000-0015"));
        contacts.add(new Contact("Ahmed16", "00-000-0016"));
        contacts.add(new Contact("Ahmed17", "00-000-0017"));
        contacts.add(new Contact("Ahmed18", "00-000-0018"));
        contacts.add(new Contact("Ahmed19", "00-000-0019"));
        contacts.add(new Contact("Ahmed20", "00-000-0020"));
        contacts.add(new Contact("Ahmed21", "00-000-0021"));
        contacts.add(new Contact("Ahmed22", "00-000-0022"));
        contacts.add(new Contact("Ahmed23", "00-000-0023"));
        contacts.add(new Contact("Ahmed24", "00-000-0024"));
        contacts.add(new Contact("Ahmed25", "00-000-0025"));
        contacts.add(new Contact("Ahmed26", "00-000-0026"));
        contacts.add(new Contact("Ahmed27", "00-000-0027"));
        contacts.add(new Contact("Ahmed28", "00-000-0028"));
        contacts.add(new Contact("Ahmed29", "00-000-0029"));
        contacts.add(new Contact("Ahmed30", "00-000-0030"));
        contacts.add(new Contact("Ahmed31", "00-000-0031"));
        contacts.add(new Contact("Ahmed32", "00-000-0032"));
        contacts.add(new Contact("Ahmed33", "00-000-0033"));
        contacts.add(new Contact("Ahmed34", "00-000-0034"));
        contacts.add(new Contact("Ahmed35", "00-000-0035"));
        contacts.add(new Contact("Ahmed36", "00-000-0036"));
        contacts.add(new Contact("Ahmed37", "00-000-0037"));
        contacts.add(new Contact("Ahmed38", "00-000-0038"));
        contacts.add(new Contact("Ahmed39", "00-000-0039"));
        contacts.add(new Contact("Ahmed40", "00-000-0040"));
        contacts.add(new Contact("Ahmed41", "00-000-0041"));
        contacts.add(new Contact("Ahmed42", "00-000-0042"));
        contacts.add(new Contact("Ahmed43", "00-000-0043"));
        contacts.add(new Contact("Ahmed44", "00-000-0044"));
        contacts.add(new Contact("Ahmed45", "00-000-0045"));
        contacts.add(new Contact("Ahmed46", "00-000-0046"));
        contacts.add(new Contact("Ahmed47", "00-000-0047"));
        contacts.add(new Contact("Ahmed48", "00-000-0048"));
        contacts.add(new Contact("Ahmed49", "00-000-0049"));
        contacts.add(new Contact("Ahmed50", "00-000-0050"));
        contacts.add(new Contact("Ahmed51", "00-000-0051"));
        contacts.add(new Contact("Ahmed52", "00-000-0052"));
        contacts.add(new Contact("Ahmed53", "00-000-0053"));
        contacts.add(new Contact("Ahmed54", "00-000-0054"));
        contacts.add(new Contact("Ahmed55", "00-000-0055"));
        contacts.add(new Contact("Ahmed56", "00-000-0056"));
        contacts.add(new Contact("Ahmed57", "00-000-0057"));
        contacts.add(new Contact("Ahmed58", "00-000-0058"));
        contacts.add(new Contact("Ahmed59", "00-000-0059"));
        contacts.add(new Contact("Ahmed60", "00-000-0060"));
        contacts.add(new Contact("Ahmed61", "00-000-0061"));
        contacts.add(new Contact("Ahmed62", "00-000-0062"));
        contacts.add(new Contact("Ahmed63", "00-000-0063"));
        contacts.add(new Contact("Ahmed64", "00-000-0064"));
        contacts.add(new Contact("Ahmed65", "00-000-0065"));
        contacts.add(new Contact("Ahmed66", "00-000-0066"));
        contacts.add(new Contact("Ahmed67", "00-000-0067"));
        contacts.add(new Contact("Ahmed68", "00-000-0068"));
        contacts.add(new Contact("Ahmed69", "00-000-0069"));
        contacts.add(new Contact("Ahmed70", "00-000-0070"));
        contacts.add(new Contact("Ahmed71", "00-000-0071"));
        contacts.add(new Contact("Ahmed72", "00-000-0072"));
        contacts.add(new Contact("Ahmed73", "00-000-0073"));
        contacts.add(new Contact("Ahmed74", "00-000-0074"));
        contacts.add(new Contact("Ahmed75", "00-000-0075"));
        contacts.add(new Contact("Ahmed76", "00-000-0076"));
        contacts.add(new Contact("Ahmed77", "00-000-0077"));
        contacts.add(new Contact("Ahmed78", "00-000-0078"));
        contacts.add(new Contact("Ahmed79", "00-000-0079"));
        contacts.add(new Contact("Ahmed80", "00-000-0080"));
        contacts.add(new Contact("Ahmed81", "00-000-0081"));
        contacts.add(new Contact("Ahmed82", "00-000-0082"));
        contacts.add(new Contact("Ahmed83", "00-000-0083"));
        contacts.add(new Contact("Ahmed84", "00-000-0084"));
        contacts.add(new Contact("Ahmed85", "00-000-0085"));
        contacts.add(new Contact("Ahmed86", "00-000-0086"));
        contacts.add(new Contact("Ahmed87", "00-000-0087"));
        contacts.add(new Contact("Ahmed88", "00-000-0088"));
        contacts.add(new Contact("Ahmed89", "00-000-0089"));
        contacts.add(new Contact("Ahmed90", "00-000-0090"));
        contacts.add(new Contact("Ahmed91", "00-000-0091"));
        contacts.add(new Contact("Ahmed92", "00-000-0092"));
        contacts.add(new Contact("Ahmed93", "00-000-0093"));
        contacts.add(new Contact("Ahmed94", "00-000-0094"));
        contacts.add(new Contact("Ahmed95", "00-000-0095"));
        contacts.add(new Contact("Ahmed96", "00-000-0096"));
        contacts.add(new Contact("Ahmed97", "00-000-0097"));
        contacts.add(new Contact("Ahmed98", "00-000-0098"));
        contacts.add(new Contact("Ahmed99", "00-000-0099"));
        contacts.add(new Contact("Ahmed100", "00-000-0100"));

        ListView myListView = (ListView) findViewById(R.id.myRootView);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,contacts.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

        ContactsAdapter myAdapter= new ContactsAdapter(this,contacts);

        myListView.setAdapter(myAdapter);
    }
}
