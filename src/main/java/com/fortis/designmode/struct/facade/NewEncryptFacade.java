package com.fortis.designmode.struct.facade;

import java.io.FileReader;
import java.io.FileWriter;

public class NewEncryptFacade extends AbstractEncryptFacade {
    @Override
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        private FileReader reader;
        private NewCipherMachine cipher;
        private FileWriter writer;

        public NewEncryptFacade()
        {
            reader = new FileReader();
            cipher = new NewCipherMachine();
            writer = new FileWriter();
        }

        public override void FileEncrypt(string fileNameSrc, string fileNameDes)
        {
            System.out.println("文件加密"+ fileNameDes);
        }

    }
}
