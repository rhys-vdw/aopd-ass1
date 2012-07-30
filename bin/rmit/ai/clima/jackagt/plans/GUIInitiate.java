/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.plans;
import aos.jack.jak.plan.Plan;
import aos.jack.jak.plan.PlanFSM;
import aos.jack.jak.plan.ExMap;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import aos.jack.jak.event.Event;
import aos.jack.jak.task.Task;
import aos.jack.jak.core.Generator;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.data.GUICurrentStep;
import rmit.ai.clima.jackagt.data.BAgentNumbers;
import aos.jack.util.thread.Semaphore;
import rmit.ai.clima.jackagt.agents.GUIAgent;
import rmit.ai.clima.gui.GuiInterface;
import rmit.ai.clima.gui.grid.GameGraphics;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class GUIInitiate extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.MESimStart mesimstart_h;
    public rmit.ai.clima.jackagt.data.GUICurrentStep bel_GUICurrentStep_dat;
    public rmit.ai.clima.jackagt.data.BAgentNumbers bel_agentNumbers_dat;
    public aos.jack.util.thread.Semaphore mutex_accessGUI_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/GUIInitiate.plan",
            "body",
            "46",
            "48",
            "58",
            "64",
            "69",
            "75",
            "77",
            "83",
            "85",
            "88",
            "91",
            "93",
            "97",
            "43"};
    private final static java.lang.String[] __planVariableNames = {
            "mesimstart_h",
            "bel_GUICurrentStep_dat",
            "bel_agentNumbers_dat",
            "mutex_accessGUI_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.MESimStart",
            "rmit.ai.clima.jackagt.data.GUICurrentStep",
            "rmit.ai.clima.jackagt.data.BAgentNumbers",
            "aos.jack.util.thread.Semaphore"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "gui",
            "title",
            "agentNo"};
    private final static java.lang.String[] __fsmTypes_body = {
            "GUIAgent",
            "String",
            "int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__10_0",
            "__local__10_1",
            "__local__10_2"};
    public GUIInitiate()
    {
    }
    
    private GUIInitiate(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.GUIInitiate __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        mesimstart_h = __env.mesimstart_h;
        bel_GUICurrentStep_dat = __env.bel_GUICurrentStep_dat;
        bel_agentNumbers_dat = __env.bel_agentNumbers_dat;
        mutex_accessGUI_dat = __env.mutex_accessGUI_dat;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        mesimstart_h = (rmit.ai.clima.jackagt.events.MESimStart) __a.findEvent("rmit.ai.clima.jackagt.events.MESimStart");
        if (mesimstart_h == null) {
            warning("Failed to find MESimStart mesimstart_h");
            return false;
        }
        bel_GUICurrentStep_dat = (rmit.ai.clima.jackagt.data.GUICurrentStep) lookupNamedObject("bel_GUICurrentStep_dat","rmit.ai.clima.jackagt.data.GUICurrentStep",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_GUICurrentStep_dat == null) {
            warning("Failed to find GUICurrentStep bel_GUICurrentStep_dat");
            return false;
        }
        bel_agentNumbers_dat = (rmit.ai.clima.jackagt.data.BAgentNumbers) lookupNamedObject("bel_agentNumbers_dat","rmit.ai.clima.jackagt.data.BAgentNumbers",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_agentNumbers_dat == null) {
            warning("Failed to find BAgentNumbers bel_agentNumbers_dat");
            return false;
        }
        mutex_accessGUI_dat = (aos.jack.util.thread.Semaphore) lookupNamedObject("mutex_accessGUI_dat","aos.jack.util.thread.Semaphore",0);
        if (mutex_accessGUI_dat == null) {
            warning("Failed to find Semaphore mutex_accessGUI_dat");
            return false;
        }
        return true;
    }
    
    public aos.jack.jak.plan.Plan freeze()
    {
        return this;
    }
    
    public aos.jack.jak.plan.Plan unfreeze()
    {
        return this;
    }
    
    public java.lang.Object genObject(int __index)
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal Object Construction");
        return null;
    }
    
    public aos.jack.jak.cursor.Cursor genCursor(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal Cursor Construction");
        return null;
    }
    
    public aos.jack.jak.fsm.FSM genFSM(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal FSM Construction");
        return null;
    }
    
    public boolean testCondition(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal test Construction");
        return false;
    }
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.GUIInitiate.__bodyFSM();
    }
    
    private GUIInitiate(rmit.ai.clima.jackagt.events.MESimStart __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.GUIInitiate __env)
    {
        this(__t,__env);
        this.mesimstart_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return mesimstart_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.MESimStart";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled();
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.MESimStart)) 
            return null;
        rmit.ai.clima.jackagt.events.MESimStart __e1 = (rmit.ai.clima.jackagt.events.MESimStart) __e;
        return new rmit.ai.clima.jackagt.plans.GUIInitiate(__e1,__t,this);
    }
    
    public java.lang.String[] variableNames()
    {
        return __planVariableNames;
    }
    
    public java.lang.String[] variableTypes()
    {
        return __planVariableTypes;
    }
    
    public java.lang.Object getVariable(int n)
    {
        switch (n) {
            case 0: 
            {
                return aos.util.ToObject.box(mesimstart_h);
            }
            case 1: 
            {
                return aos.util.ToObject.box(bel_GUICurrentStep_dat);
            }
            case 2: 
            {
                return aos.util.ToObject.box(bel_agentNumbers_dat);
            }
            case 3: 
            {
                return aos.util.ToObject.box(mutex_accessGUI_dat);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Plan " + this + " does not have variable number " + n);
            }
        }
    }
    
    public java.lang.String[] reasoningMethods()
    {
        return mergeReasoningMethods(__reasoningMethods,super.reasoningMethods());
    }
    
    public aos.jack.jak.cursor.Cursor context()
    {
        try {
            return (((true)?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        rmit.ai.clima.jackagt.agents.GUIAgent __local__10_0;
        java.lang.String __local__10_1;
        int __local__10_2;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-GUIInitiate.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.GUIInitiate.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("GUIInitiate.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (46)     GUIAgent gui = (GUIAgent)getAgent();
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__10_0 = (rmit.ai.clima.jackagt.agents.GUIAgent) getAgent();
                            __state = 11;
                            break;
                        }
                        //* (48) 	@waitFor(mutex_accessGUI_dat.planWait()); // Hold the mutex for updating the GUI
                        case 11: 
                        {
                            __task.push(new aos.jack.jak.fsm.WaitForFSM(getAgent(),__task,this,0));
                            __state = -__state;
                            __subtask_pass = 12;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (58)         if(gui.showGUI && !gui.guiReady) {
                        case 12: 
                        {
                            if (__local__10_0.showGUI && !__local__10_0.guiReady) 
                                __state = 13;
                             else 
                                __state = 17;
                            break;
                        }
                        //* (64) 				String title = "Sim Id: " + mesimstart_h.id + " - Opponent: " + mesimstart_h.opponent; 
                        case 13: 
                        {
                            __breakLevel = 2;
                            __local__10_1 = "Sim Id: " + mesimstart_h.id + " - Opponent: " + mesimstart_h.opponent;
                            __state = 14;
                            break;
                        }
                        //* (69)   				gui.guiInterface = 	new GuiInterface(
                        case 14: 
                        {
                            __state = 15;
                            // We pass the gui agent itself for call backs 				
// constructor for new gui

                            __local__10_0.guiInterface = new rmit.ai.clima.gui.GuiInterface(__local__10_1,"Gold","Diggers ",mesimstart_h.gridSize.x,mesimstart_h.gridSize.y,__local__10_0.maxAgents,__local__10_0,rmit.ai.clima.gui.grid.GameGraphics.getEmptyGraphic(),rmit.ai.clima.gui.grid.GameGraphics.getEmptyGraphic());
                            break;
                        }
                        //* (75)             	gui.guiReady=true;	// now the GUI is ready to be used!
                        case 15: 
                        {
                            __state = 16;
                            //gui.guiInterface.setVisible(true);

                            __local__10_0.guiReady = true;
                            break;
                        }
                        //* (77) 	            System.out.println("================> GUI interface initialized <=================");
                        case 16: 
                        {
                            __state = 17;
                            // now the GUI is ready to be used!

                            java.lang.System.out.println("================> GUI interface initialized <=================");
                            break;
                        }
                        //* (83)     if(gui.showGUI){
                        case 17: 
                        {
                            if (__local__10_0.showGUI) 
                                __state = 18;
                             else 
                                __state = 22;
                            break;
                        }
                        //* (85)     	int agentNo = gui.guiInterface.newAgent(mesimstart_h.from, GameGraphics.getAgentGraphic()); 	
                        case 18: 
                        {
                            __breakLevel = 2;
                            __local__10_2 = __local__10_0.guiInterface.newAgent(mesimstart_h.from,rmit.ai.clima.gui.grid.GameGraphics.getAgentGraphic());
                            __state = 19;
                            break;
                        }
                        //* (88)     	bel_agentNumbers_dat.add(mesimstart_h.from, agentNo); 
                        case 19: 
                        {
                            __state = 20;
                            // Register the agent for tracking

                            bel_agentNumbers_dat.add(mesimstart_h.from,__local__10_2);
                            break;
                        }
                        //* (91) 	    bel_GUICurrentStep_dat.add(agentNo, 0);
                        case 20: 
                        {
                            __state = 21;
                            // Second, initialize the agent in the GUI

                            bel_GUICurrentStep_dat.add(__local__10_2,0);
                            break;
                        }
                        //* (93) 	    System.out.println("=================> Agent "+mesimstart_h.from+" registered in the GUI with number "+agentNo);
                        case 21: 
                        {
                            __state = 22;
                            java.lang.System.out.println("=================> Agent " + mesimstart_h.from + " registered in the GUI with number " + __local__10_2);
                            break;
                        }
                        //* (97)     mutex_accessGUI_dat.signal(); // release mutex
                        case 22: 
                        {
                            __state = 23;
                            mutex_accessGUI_dat.signal();
                            break;
                        }
                        //* (43)    body()
                        case 23: 
                        {
                            if (__pending == null) 
                                __state = PASSED_STATE;
                            __tothrow = __pending;
                            break;
                        }
                    }
                }
                catch (java.lang.Throwable e) {
                    handleException(e,__exMap_body);
                }
            }
             while (!agent.changing_focus);
            return CONTINUE;
        }
        
        public java.lang.String methodName()
        {
            return "body";
        }
        
        __bodyFSM()
        {
        }
        
        public java.lang.String stateInfo()
        {
            int n = __curstate;
            java.lang.String file = __tt__body[0];
            java.lang.String method = __tt__body[1];
            if (n < 0) 
                n = -n;
            n -= (10 - 2);
            java.lang.String line = (n < 2)?"??":__tt__body[n];
            return file + ":" + line + " " + method + " [" + __curstate + "]";
        }
        
        public java.lang.Object genObject(int __index)
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal Object Construction");
            return null;
        }
        
        public aos.jack.jak.cursor.Cursor genCursor(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
                case 0: 
                {
                    return (mutex_accessGUI_dat.planWait());
                }
            }
            aos.jack.jak.core.Jak.error("illegal Cursor Construction");
            return null;
        }
        
        public aos.jack.jak.fsm.FSM genFSM(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal FSM Construction");
            return null;
        }
        
        public boolean testCondition(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal test Construction");
            return false;
        }
        
        public aos.jack.jak.plan.Plan getPlan()
        {
            return rmit.ai.clima.jackagt.plans.GUIInitiate.this;
        }
        
        protected aos.jack.jak.fsm.FSM fail()
        {
            return getPlan().fail();
        }
        
        protected aos.jack.jak.fsm.FSM pass()
        {
            return getPlan().pass();
        }
        
        public void enter()
        {
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.GUIInitiate.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__10_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__10_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__10_2);
                }
                default: 
                {
                    throw new java.lang.IndexOutOfBoundsException("Reasoning Method " + methodName() + " does not have variable number " + n);
                }
            }
        }
        
        public java.lang.String[] variableNames()
        {
            return __fsmVariableNames_body;
        }
        
        public java.lang.String[] variableTypes()
        {
            return __fsmTypes_body;
        }
        
        public java.lang.String[] variableLocalNames()
        {
            return __fsmLocalNames_body;
        }
        
    }
}
