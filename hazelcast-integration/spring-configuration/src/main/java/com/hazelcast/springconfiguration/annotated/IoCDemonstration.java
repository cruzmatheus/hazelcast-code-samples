package com.hazelcast.springconfiguration.annotated;

import com.hazelcast.collection.IList;
import com.hazelcast.collection.IQueue;
import com.hazelcast.collection.ISet;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.cp.IAtomicLong;
import com.hazelcast.cp.IAtomicReference;
import com.hazelcast.cp.ICountDownLatch;
import com.hazelcast.cp.ISemaphore;
import com.hazelcast.cp.lock.FencedLock;
import com.hazelcast.flakeidgen.FlakeIdGenerator;
import com.hazelcast.map.IMap;
import com.hazelcast.multimap.MultiMap;
import com.hazelcast.topic.ITopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * This class shows the way you must declare the attributes to retrieve the hazelcast objects from spring context.
 * <p/>
 * Note: for collections, you must use the {@code @Resource} annotation instead of {@code @Autowired}.
 */
@Component
@SuppressWarnings("unused")
public class IoCDemonstration {

    @Resource(name = "map")
    private IMap<Object, Object> hzMap;

    @Autowired
    private MultiMap<Object, Object> hzMultiMap;

    @Resource(name = "queue")
    private IQueue<Object> hzQueue;

    @Autowired
    private ITopic hzTopic;

    @Resource(name = "set")
    private ISet<Object> hzSet;

    @Resource(name = "list")
    private IList<Object> hzList;

    @Autowired
    private IExecutorService hzExecutorService;

    @Autowired
    private FlakeIdGenerator hzFlakeIdGenerator;

    @Autowired
    private IAtomicLong hzAtomicLong;

    @Autowired
    private IAtomicReference<Object> hzAtomicReference;

    @Autowired
    private ICountDownLatch hzCountDownLatch;

    @Autowired
    private ISemaphore hzSemaphore;

    @Autowired
    private FencedLock hzLock;

    @PostConstruct
    public void theProof() {
        Assert.notNull(this.hzMap);
        Assert.notNull(this.hzMultiMap);
        Assert.notNull(this.hzQueue);
        Assert.notNull(this.hzTopic);
        Assert.notNull(this.hzSet);
        Assert.notNull(this.hzList);
        Assert.notNull(this.hzExecutorService);
        Assert.notNull(this.hzFlakeIdGenerator);
        Assert.notNull(this.hzAtomicLong);
        Assert.notNull(this.hzAtomicReference);
        Assert.notNull(this.hzCountDownLatch);
        Assert.notNull(this.hzSemaphore);
        Assert.notNull(this.hzLock);
        Assert.notNull(this.hzMap);

        System.out.println("hzMap = " + this.hzMap.getClass());
        System.out.println("hzMultiMap = " + this.hzMultiMap.getClass());
        System.out.println("hzQueue = " + this.hzQueue.getClass());
        System.out.println("hzTopic = " + this.hzTopic.getClass());
        System.out.println("hzSet = " + this.hzSet.getClass());
        System.out.println("hzList = " + this.hzList.getClass());
        System.out.println("hzExecutorService = " + this.hzExecutorService.getClass());
        System.out.println("hzFlakeIdGenerator = " + this.hzFlakeIdGenerator.getClass());
        System.out.println("hzAtomicLong = " + this.hzAtomicLong.getClass());
        System.out.println("hzAtomicReference = " + this.hzAtomicReference.getClass());
        System.out.println("hzCountDownLatch = " + this.hzCountDownLatch.getClass());
        System.out.println("hzSemaphore = " + this.hzSemaphore.getClass());
        System.out.println("hzLock = " + this.hzLock.getClass());
        System.out.println("hzMap = " + this.hzMap.getClass());
    }
}
