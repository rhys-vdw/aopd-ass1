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
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.iface.PerceiveClimaServer;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.interfaces.DebugInterface;
import rmit.ai.clima.comms.SimStart;
import rmit.ai.clima.gui.grid.GridObject;
import rmit.ai.clima.gui.grid.GameGraphics;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;
import rmit.ai.clima.gui.grid.GridPoint;

public class StartSimulation extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.MEInformCellStatus meinformcellstatus_s;
    public rmit.ai.clima.jackagt.events.MESimStart mesimstart_s;
    public rmit.ai.clima.iface.PerceiveClimaServer perceiveclimaserver_h;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_fail;
    private static java.lang.String[] __tt__fail = {
            "rmit/ai/clima/jackagt/plans/StartSimulation.plan",
            "fail",
            "61",
            "58"};
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/StartSimulation.plan",
            "body",
            "69",
            "72",
            "75",
            "76",
            "79",
            "79",
            "80",
            "80",
            "66",
            "80",
            "79",
            "88",
            "93",
            "97",
            "98",
            "102",
            "66"};
    private final static java.lang.String[] __planVariableNames = {
            "eguidebugmessage_s",
            "meinformcellstatus_s",
            "mesimstart_s",
            "perceiveclimaserver_h",
            "bel_currentRequestActionId_dat",
            "bel_simulationProp_dat",
            "bel_goldAt_dat",
            "bel_cellEmpty_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "EGUIDebugMessage",
            "MEInformCellStatus",
            "MESimStart",
            "rmit.ai.clima.iface.PerceiveClimaServer",
            "rmit.ai.clima.jackagt.data.CurrentRequestActionId",
            "rmit.ai.clima.jackagt.data.SimulationProp",
            "GoldAt",
            "CellEmpty",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body",
            "fail"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "simStart",
            "x",
            "y",
            "gridobj"};
    private final static java.lang.String[] __fsmTypes_body = {
            "SimStart",
            "int",
            "int",
            "GridObject"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__20_0",
            "__local__20_1",
            "__local__20_2",
            "__local__20_3"};
    static boolean relevant(rmit.ai.clima.iface.PerceiveClimaServer perceiveclimaserver_h)
    {
        return perceiveclimaserver_h.data instanceof rmit.ai.clima.comms.SimStart;
    }
    
    public StartSimulation()
    {
    }
    
    private StartSimulation(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.StartSimulation __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eguidebugmessage_s = __env.eguidebugmessage_s;
        meinformcellstatus_s = __env.meinformcellstatus_s;
        mesimstart_s = __env.mesimstart_s;
        perceiveclimaserver_h = __env.perceiveclimaserver_h;
        bel_currentRequestActionId_dat = __env.bel_currentRequestActionId_dat;
        bel_simulationProp_dat = __env.bel_simulationProp_dat;
        bel_goldAt_dat = __env.bel_goldAt_dat;
        bel_cellEmpty_dat = __env.bel_cellEmpty_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_s == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_s");
            return false;
        }
        meinformcellstatus_s = (rmit.ai.clima.jackagt.events.MEInformCellStatus) __a.findEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus");
        if (meinformcellstatus_s == null) {
            warning("Failed to find MEInformCellStatus meinformcellstatus_s");
            return false;
        }
        mesimstart_s = (rmit.ai.clima.jackagt.events.MESimStart) __a.findEvent("rmit.ai.clima.jackagt.events.MESimStart");
        if (mesimstart_s == null) {
            warning("Failed to find MESimStart mesimstart_s");
            return false;
        }
        perceiveclimaserver_h = (rmit.ai.clima.iface.PerceiveClimaServer) __a.findEvent("rmit.ai.clima.iface.PerceiveClimaServer");
        if (perceiveclimaserver_h == null) {
            warning("Failed to find PerceiveClimaServer perceiveclimaserver_h");
            return false;
        }
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) lookupNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_currentRequestActionId_dat == null) {
            warning("Failed to find CurrentRequestActionId bel_currentRequestActionId_dat");
            return false;
        }
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) lookupNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_simulationProp_dat == null) {
            warning("Failed to find SimulationProp bel_simulationProp_dat");
            return false;
        }
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) lookupNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_goldAt_dat == null) {
            warning("Failed to find GoldAt bel_goldAt_dat");
            return false;
        }
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) lookupNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_cellEmpty_dat == null) {
            warning("Failed to find CellEmpty bel_cellEmpty_dat");
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
    
    public aos.jack.jak.plan.PlanFSM fail()
    {
        return new rmit.ai.clima.jackagt.plans.StartSimulation.__failFSM();
    }
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.StartSimulation.__bodyFSM();
    }
    
    private StartSimulation(rmit.ai.clima.iface.PerceiveClimaServer __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.StartSimulation __env)
    {
        this(__t,__env);
        this.perceiveclimaserver_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return perceiveclimaserver_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.iface.PerceiveClimaServer";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.iface.PerceiveClimaServer) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.iface.PerceiveClimaServer)) 
            return null;
        rmit.ai.clima.iface.PerceiveClimaServer __e1 = (rmit.ai.clima.iface.PerceiveClimaServer) __e;
        return new rmit.ai.clima.jackagt.plans.StartSimulation(__e1,__t,this);
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
                return aos.util.ToObject.box(eguidebugmessage_s);
            }
            case 1: 
            {
                return aos.util.ToObject.box(meinformcellstatus_s);
            }
            case 2: 
            {
                return aos.util.ToObject.box(mesimstart_s);
            }
            case 3: 
            {
                return aos.util.ToObject.box(perceiveclimaserver_h);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_currentRequestActionId_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_simulationProp_dat);
            }
            case 6: 
            {
                return aos.util.ToObject.box(bel_goldAt_dat);
            }
            case 7: 
            {
                return aos.util.ToObject.box(bel_cellEmpty_dat);
            }
            case 8: 
            {
                return aos.util.ToObject.box(consoleIface);
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
    
    class __failFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-StartSimulation.fail:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.StartSimulation.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("StartSimulation.fail: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (61) 		consoleIface.showConsoleDebug(getPlanName()+" :: Plan has failed!");
                        case 10: 
                        {
                            __breakLevel = 0;
                            __state = 11;
                            consoleIface.showConsoleDebug(getPlanName() + " :: Plan has failed!");
                            break;
                        }
                        //* (58)     #reasoning method
                        case 11: 
                        {
                            if (__pending == null) 
                                __state = PASSED_STATE;
                            __tothrow = __pending;
                            break;
                        }
                    }
                }
                catch (java.lang.Throwable e) {
                    handleException(e,__exMap_fail);
                }
            }
             while (!agent.changing_focus);
            return CONTINUE;
        }
        
        public java.lang.String methodName()
        {
            return "fail";
        }
        
        __failFSM()
        {
        }
        
        public java.lang.String stateInfo()
        {
            int n = __curstate;
            java.lang.String file = __tt__fail[0];
            java.lang.String method = __tt__fail[1];
            if (n < 0) 
                n = -n;
            n -= (10 - 2);
            java.lang.String line = (n < 2)?"??":__tt__fail[n];
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
            return rmit.ai.clima.jackagt.plans.StartSimulation.this;
        }
        
        public void enter()
        {
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.StartSimulation.fail");
        }
        
    }
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        rmit.ai.clima.comms.SimStart __local__20_0;
        int __local__20_1;
        int __local__20_2;
        rmit.ai.clima.gui.grid.GridObject __local__20_3;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-StartSimulation.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.StartSimulation.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("StartSimulation.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (69) 		consoleIface.showConsoleDebug("I have received a SIM-START message....");
                        case 10: 
                        {
                            __breakLevel = 0;
                            __state = 11;
                            consoleIface.showConsoleDebug("I have received a SIM-START message....");
                            break;
                        }
                        //* (72)         SimStart simStart = (SimStart)perceiveclimaserver_h.data;
                        case 11: 
                        {
                            __local__20_0 = (rmit.ai.clima.comms.SimStart) perceiveclimaserver_h.data;
                            __state = 12;
                            break;
                        }
                        //* (75)         bel_currentRequestActionId_dat.add(0,0);	
                        case 12: 
                        {
                            __state = 13;
                            // Initialise agent's beliefs (it is assumed the beliefs are empty)

                            bel_currentRequestActionId_dat.add(0,0);
                            break;
                        }
                        //* (76)         bel_simulationProp_dat.add(simStart.gsizex, simStart.gsizey, simStart.depotx, simStart.depoty, simStart.steps);	// Update the beliefs about the current simulation
                        case 13: 
                        {
                            __state = 14;
                            bel_simulationProp_dat.add(__local__20_0.gsizex,__local__20_0.gsizey,__local__20_0.depotx,__local__20_0.depoty,__local__20_0.steps);
                            break;
                        }
                        //* (79)         for(int x=0;x<simStart.gsizex; x++) {
                        case 14: 
                        {
                            __local__20_1 = 0;
                            __state = 15;
                            break;
                        }
                        //* (79)         for(int x=0;x<simStart.gsizex; x++) {
                        case 15: 
                        {
                            if (__local__20_1 < __local__20_0.gsizex) 
                                __state = 16;
                             else 
                                __state = 21;
                            break;
                        }
                        //* (80)             for(int y=0; y<simStart.gsizey;y++) {
                        case 16: 
                        {
                            __breakLevel = 4;
                            __local__20_2 = 0;
                            __state = 17;
                            break;
                        }
                        //* (80)             for(int y=0; y<simStart.gsizey;y++) {
                        case 17: 
                        {
                            if (__local__20_2 < __local__20_0.gsizey) 
                                __state = 18;
                             else 
                                __state = 20;
                            break;
                        }
                        //* (66)     #reasoning method
                        case 18: 
                        {
                            __breakLevel = 8;
                            __state = 19;
                            break;
                        }
                        //* (80)             for(int y=0; y<simStart.gsizey;y++) {
                        case 19: 
                        {
                            __state = 17;
                            __local__20_2++ ;
                            break;
                        }
                        //* (79)         for(int x=0;x<simStart.gsizex; x++) {
                        case 20: 
                        {
                            __state = 15;
                            __local__20_1++ ;
                            break;
                        }
                        //* (88)         @send("boss", mesimstart_s.send(simStart.id, simStart.opponent, GridPoint.getCur(simStart.gsizex, simStart.gsizey),
                        case 21: 
                        {
                            __state = 22;
                            agent.send("boss",mesimstart_s.send(__local__20_0.id,__local__20_0.opponent,rmit.ai.clima.gui.grid.GridPoint.getCur(__local__20_0.gsizex,__local__20_0.gsizey),rmit.ai.clima.gui.grid.GridPoint.getCur(__local__20_0.depotx,__local__20_0.depoty),__local__20_0.steps));
                            break;
                        }
                        //* (93)     	@send("gui", mesimstart_s.send(simStart.id, simStart.opponent, GridPoint.getCur(simStart.gsizex, simStart.gsizey),
                        case 22: 
                        {
                            __state = 23;
                            agent.send("gui",mesimstart_s.send(__local__20_0.id,__local__20_0.opponent,rmit.ai.clima.gui.grid.GridPoint.getCur(__local__20_0.gsizex,__local__20_0.gsizey),rmit.ai.clima.gui.grid.GridPoint.getCur(__local__20_0.depotx,__local__20_0.depoty),__local__20_0.steps));
                            break;
                        }
                        //* (97)     	GridObject gridobj = new GridObject(simStart.depotx, simStart.depoty, GameGraphics.getDepotString());
                        case 23: 
                        {
                            __local__20_3 = new rmit.ai.clima.gui.grid.GridObject(__local__20_0.depotx,__local__20_0.depoty,rmit.ai.clima.gui.grid.GameGraphics.getDepotString());
                            __state = 24;
                            break;
                        }
                        //* (98)     	@send("gui", meinformcellstatus_s.send(gridobj));
                        case 24: 
                        {
                            __state = 25;
                            agent.send("gui",meinformcellstatus_s.send(__local__20_3));
                            break;
                        }
                        //* (102) 		consoleIface.showConsoleDebug("I have just started a new simulation!");
                        case 25: 
                        {
                            __state = 26;
                            // Report the start of a new simulation for this agent

                            consoleIface.showConsoleDebug("I have just started a new simulation!");
                            break;
                        }
                        //* (66)     #reasoning method
                        case 26: 
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
            return rmit.ai.clima.jackagt.plans.StartSimulation.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.StartSimulation.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__20_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__20_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__20_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__20_3);
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
