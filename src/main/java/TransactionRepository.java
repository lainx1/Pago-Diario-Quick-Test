import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    public List<Transaction> getTransactions() {

        try {

            File file = new File("./src/main/java/Transactions.json");
            if (file.exists())
                System.out.println("Archivo existe");

            InputStream inputStream = new FileInputStream(file);
            String transactionsJson = IOUtils.toString(inputStream, StandardCharsets.UTF_8 );

            Moshi moshi = new Moshi.Builder().add(new DateAdapter()).build();
            ParameterizedType listOfTransactions = Types.newParameterizedType(List.class, Transaction.class);
            JsonAdapter<List<Transaction>> jsonAdapter = moshi.adapter(listOfTransactions);

            return jsonAdapter.fromJson(transactionsJson);

        } catch (IOException e){
            e.printStackTrace();
        }


        return new ArrayList<>();
    }

}
