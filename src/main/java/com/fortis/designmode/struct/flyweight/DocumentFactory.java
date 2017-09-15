package com.fortis.designmode.struct.flyweight;

import java.util.HashMap;

public class DocumentFactory  {

    private HashMap<String,Document> documents ;

    private DocumentFactory(){
        documents = new HashMap<String,Document>();
        documents.put("img",new ImageDocument());
        documents.put("text",new TextDocument());
    }

    private static class DocumentFactoryHolder{
        private final static DocumentFactory instance=new DocumentFactory();
    }

    public static DocumentFactory getDocumentFactory(){
        return DocumentFactoryHolder.instance;
    }


    public Document getDocumet(String key){
        return this.documents.get(key);
    }

}
