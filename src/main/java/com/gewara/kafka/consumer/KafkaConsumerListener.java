package com.gewara.kafka.consumer;


/**
 * Created by hrs on 14-3-13.
 */
public interface KafkaConsumerListener {

	/**
	 * ������Ϣ
	 * @param value
	 */
    void receiveMessages(String key,String value);
    
    /**
     * ������Ϣ
     * @param value
     */
    void receiveMessages(String value);
    
    /**
     * �߳���
     * @return
     */
    int getProcessThreads();

    /**
     * ����������������
     * @return
     */
    String getGroupId();

    /**
     * ������
     * @return
     */
    String getTopic();

	
    
    
    




}
