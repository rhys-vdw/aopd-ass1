/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.capabilities;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.jackagt.data.BAgentNumbers;
import aos.jack.util.thread.Semaphore;
import rmit.ai.clima.jackagt.data.GUICurrentStep;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.plans.GUIUpdateCell;
import rmit.ai.clima.jackagt.plans.GUIReportMessage;
import rmit.ai.clima.jackagt.plans.GUIClose;
import rmit.ai.clima.jackagt.plans.GUIInitiate;
import rmit.ai.clima.jackagt.plans.GUIUpdateAgentLoc;
import java.lang.Object;

public class GUIUpdateCapability extends aos.jack.jak.agent.Capability {
    public rmit.ai.clima.jackagt.data.BAgentNumbers bel_agentNumbers_dat;
    public aos.jack.util.thread.Semaphore mutex_accessGUI_dat;
    public rmit.ai.clima.jackagt.data.GUICurrentStep bel_GUICurrentStep_dat;
    // Inner capabilities are declared here.
/******** End PDT Design Block *** DO NOT EDIT IT *********/
// As the semaphore is grabbed initially by the constructing thread, 
// it must also be released by a call to signal(). 
// This releases the semaphore after it has been constructed,

    protected void autorun()
    {
        mutex_accessGUI_dat.signal();
    }
    
    public void __init1()
    {
        setNamedCreator("bel_agentNumbers_dat","rmit.ai.clima.jackagt.data.BAgentNumbers",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_agentNumbers_dat();
            }
            
        },true);
        setNamedCreator("mutex_accessGUI_dat","aos.jack.util.thread.Semaphore",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_mutex_accessGUI_dat();
            }
            
        },true);
        setNamedCreator("bel_GUICurrentStep_dat","rmit.ai.clima.jackagt.data.GUICurrentStep",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_GUICurrentStep_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        getNamedObject("bel_agentNumbers_dat","rmit.ai.clima.jackagt.data.BAgentNumbers");
        getNamedObject("mutex_accessGUI_dat","aos.jack.util.thread.Semaphore");
        getNamedObject("bel_GUICurrentStep_dat","rmit.ai.clima.jackagt.data.GUICurrentStep");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("rmit.ai.clima.jackagt.events.MEInformAgentStatus","rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        externals.put("rmit.ai.clima.jackagt.events.MESimStart","rmit.ai.clima.jackagt.events.MESimStart");
        externals.put("rmit.ai.clima.jackagt.events.MESimEnd","rmit.ai.clima.jackagt.events.MESimEnd");
        externals.put("rmit.ai.clima.jackagt.events.EGUIDebugMessage","rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        externals.put("rmit.ai.clima.jackagt.events.MEInformCellStatus","rmit.ai.clima.jackagt.events.MEInformCellStatus");
        addNamedObject("bel_agentNumbers_dat","rmit.ai.clima.jackagt.data.BAgentNumbers",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("mutex_accessGUI_dat","aos.jack.util.thread.Semaphore",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_GUICurrentStep_dat","rmit.ai.clima.jackagt.data.GUICurrentStep",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.GUIUpdateCell",0);
        addPlan("rmit.ai.clima.jackagt.plans.GUIReportMessage",0);
        addPlan("rmit.ai.clima.jackagt.plans.GUIClose",0);
        addPlan("rmit.ai.clima.jackagt.plans.GUIInitiate",0);
        addPlan("rmit.ai.clima.jackagt.plans.GUIUpdateAgentLoc",0);
    }
    
    public GUIUpdateCapability(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("rmit.ai.clima.jackagt.plans.GUIUpdateCell");
        __bindToPlan("rmit.ai.clima.jackagt.plans.GUIReportMessage");
        __bindToPlan("rmit.ai.clima.jackagt.plans.GUIClose");
        __bindToPlan("rmit.ai.clima.jackagt.plans.GUIInitiate");
        __bindToPlan("rmit.ai.clima.jackagt.plans.GUIUpdateAgentLoc");
    }
    
    private rmit.ai.clima.jackagt.data.BAgentNumbers __named_data_bel_agentNumbers_dat()
    {
        if (bel_agentNumbers_dat != null) 
            return bel_agentNumbers_dat;
        bel_agentNumbers_dat = new rmit.ai.clima.jackagt.data.BAgentNumbers();
        if (!bel_agentNumbers_dat.attach(this)) 
            bel_agentNumbers_dat = null;
        setNamedObject("bel_agentNumbers_dat","rmit.ai.clima.jackagt.data.BAgentNumbers",bel_agentNumbers_dat);
        return bel_agentNumbers_dat;
    }
    
    private aos.jack.util.thread.Semaphore __named_data_mutex_accessGUI_dat()
    {
        if (mutex_accessGUI_dat != null) 
            return mutex_accessGUI_dat;
        mutex_accessGUI_dat = new aos.jack.util.thread.Semaphore();
        setNamedObject("mutex_accessGUI_dat","aos.jack.util.thread.Semaphore",mutex_accessGUI_dat);
        return mutex_accessGUI_dat;
    }
    
    private rmit.ai.clima.jackagt.data.GUICurrentStep __named_data_bel_GUICurrentStep_dat()
    {
        if (bel_GUICurrentStep_dat != null) 
            return bel_GUICurrentStep_dat;
        bel_GUICurrentStep_dat = new rmit.ai.clima.jackagt.data.GUICurrentStep();
        if (!bel_GUICurrentStep_dat.attach(this)) 
            bel_GUICurrentStep_dat = null;
        setNamedObject("bel_GUICurrentStep_dat","rmit.ai.clima.jackagt.data.GUICurrentStep",bel_GUICurrentStep_dat);
        return bel_GUICurrentStep_dat;
    }
    
}
