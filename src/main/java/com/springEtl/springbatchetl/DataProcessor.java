package com.springEtl.springbatchetl;

import com.springEtl.springbatchetl.model.DataModel;
import org.springframework.batch.item.ItemProcessor;

public class DataProcessor implements ItemProcessor<DataModel, DataModel> {

    @Override
    public DataModel process(DataModel result) throws Exception {
        System.out.println("Processing result :"+result);

        /*
         * Only return results which are equal or more than 80%
         *
         */
        if(result.getPercentage() < 80){
            return null;
        }

        return result;
    }
}
