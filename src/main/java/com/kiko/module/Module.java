package com.kiko.module;

import java.util.Collection;
import java.util.List;

/**
 * @Author fengwei
 * Created on 2016/9/18/0018.
 */
public abstract class Module {
    // ģ������
    protected MODULE_TYPE type;
    // ��ģ�鼯��
    public Collection<Sector> sectors;
    // ģ�������
    public AbstractModuleManager leaderModuleManager;

    public Module(AbstractModuleManager owner) {
        this.leaderModuleManager = owner;
    }
    // ģ���ʼ��
    public abstract void init();
    // װ����ģ��
    public abstract void loadSector(Sector sector);

    //public abstract void loadSectors(List<Sector> sectors);

}
