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
import aos.jack.jak.event.Event;
import aos.jack.jak.task.Task;
import aos.jack.jak.core.Generator;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EShowBeliefs;
import rmit.ai.clima.iface.LastActionSentBel;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.jackagt.data.CurrentStatus;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class ConsoleBeliefPrinting extends aos.jack.jak.plan.Plan {
    final static java.lang.String[] dir = {
            "cur",
            "n",
            "ne",
            "e",
            "se",
            "s",
            "sw",
            "w",
            "nw"};
    public rmit.ai.clima.jackagt.events.EShowBeliefs eshowbeliefs_h;
    public rmit.ai.clima.iface.LastActionSentBel bel_lastActionSent_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.jackagt.data.CurrentStatus bel_currentStatus_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/ConsoleBeliefPrinting.plan",
            "body",
            "58",
            "60",
            "61",
            "64",
            "65",
            "67",
            "67",
            "68",
            "70",
            "73",
            "74",
            "74",
            "75",
            "77",
            "54"};
    private final static java.lang.String[] __planVariableNames = {
            "dir",
            "eshowbeliefs_h",
            "bel_lastActionSent_dat",
            "bel_cellEmpty_dat",
            "bel_currentStatus_dat",
            "bel_currentRequestActionId_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "String[]",
            "EShowBeliefs",
            "LastActionSentBel",
            "rmit.ai.clima.jackagt.data.CellEmpty",
            "CurrentStatus",
            "rmit.ai.clima.jackagt.data.CurrentRequestActionId",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$id",
            "$step",
            "$x",
            "$y",
            "count",
            "c",
            "c"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "int",
            "Cursor",
            "Cursor"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__3_0",
            "__local__3_1",
            "__local__3_2",
            "__local__3_3",
            "__local__3_4",
            "__local__3_5",
            "__local__3_6"};
    static boolean relevant(rmit.ai.clima.jackagt.events.EShowBeliefs ev)
    {
        return true;
    }
    
    public ConsoleBeliefPrinting()
    {
    }
    
    private ConsoleBeliefPrinting(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eshowbeliefs_h = __env.eshowbeliefs_h;
        bel_lastActionSent_dat = __env.bel_lastActionSent_dat;
        bel_cellEmpty_dat = __env.bel_cellEmpty_dat;
        bel_currentStatus_dat = __env.bel_currentStatus_dat;
        bel_currentRequestActionId_dat = __env.bel_currentRequestActionId_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eshowbeliefs_h = (rmit.ai.clima.jackagt.events.EShowBeliefs) __a.findEvent("rmit.ai.clima.jackagt.events.EShowBeliefs");
        if (eshowbeliefs_h == null) {
            warning("Failed to find EShowBeliefs eshowbeliefs_h");
            return false;
        }
        bel_lastActionSent_dat = (rmit.ai.clima.iface.LastActionSentBel) lookupNamedObject("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel",0);
        if (bel_lastActionSent_dat == null) {
            warning("Failed to find LastActionSentBel bel_lastActionSent_dat");
            return false;
        }
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) lookupNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",0);
        if (bel_cellEmpty_dat == null) {
            warning("Failed to find CellEmpty bel_cellEmpty_dat");
            return false;
        }
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) lookupNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",0);
        if (bel_currentStatus_dat == null) {
            warning("Failed to find CurrentStatus bel_currentStatus_dat");
            return false;
        }
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) lookupNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",0);
        if (bel_currentRequestActionId_dat == null) {
            warning("Failed to find CurrentRequestActionId bel_currentRequestActionId_dat");
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
        return new rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting.__bodyFSM();
    }
    
    private ConsoleBeliefPrinting(rmit.ai.clima.jackagt.events.EShowBeliefs __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting __env)
    {
        this(__t,__env);
        this.eshowbeliefs_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eshowbeliefs_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EShowBeliefs";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.EShowBeliefs) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EShowBeliefs)) 
            return null;
        rmit.ai.clima.jackagt.events.EShowBeliefs __e1 = (rmit.ai.clima.jackagt.events.EShowBeliefs) __e;
        return new rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting(__e1,__t,this);
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
                return aos.util.ToObject.box(dir);
            }
            case 1: 
            {
                return aos.util.ToObject.box(eshowbeliefs_h);
            }
            case 2: 
            {
                return aos.util.ToObject.box(bel_lastActionSent_dat);
            }
            case 3: 
            {
                return aos.util.ToObject.box(bel_cellEmpty_dat);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_currentStatus_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_currentRequestActionId_dat);
            }
            case 6: 
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
            return (((bel_currentStatus_dat.debugConsole())?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        aos.jack.jak.logic.IntegerVariable __local__3_0;
        aos.jack.jak.logic.IntegerVariable __local__3_1;
        aos.jack.jak.logic.IntegerVariable __local__3_2;
        aos.jack.jak.logic.IntegerVariable __local__3_3;
        int __local__3_4;
        aos.jack.jak.cursor.Cursor __local__3_5;
        aos.jack.jak.cursor.Cursor __local__3_6;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-ConsoleBeliefPrinting.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("ConsoleBeliefPrinting.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (58)         logical int $id, $step;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__3_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__3_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 11;
                            break;
                        }
                        //* (60) 		bel_currentRequestActionId_dat.get($id,$step);
                        case 11: 
                        {
                            boolean __b;
                            aos.jack.jak.cursor.Cursor __c = null;
                            try {
                                __c = genCursor(0);
                                __b = __c.next();
                            }
                            finally {
                                if (__c != null) 
                                    __c.finished();
                            }
                            if (__b) 
                                __state = 12;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (61) 	    consoleIface.showConsoleDebug("Current ID step: "+$id);
                        case 12: 
                        {
                            __state = 13;
                            consoleIface.showConsoleDebug("Current ID step: " + __local__3_0);
                            break;
                        }
                        //* (64)         logical int $x,$y;
                        case 13: 
                        {
                            __local__3_2 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__3_3 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 14;
                            break;
                        }
                        //* (65)         int count=0;
                        case 14: 
                        {
                            __local__3_4 = 0;
                            __state = 15;
                            break;
                        }
                        //* (67)         for ( Cursor c = bel_cellEmpty_dat.get($x,$y) ; c.next() ; ) {
                        case 15: 
                        {
                            __local__3_5 = (aos.jack.jak.cursor.Cursor) genCursor(1);
                            __state = 16;
                            break;
                        }
                        //* (67)         for ( Cursor c = bel_cellEmpty_dat.get($x,$y) ; c.next() ; ) {
                        case 16: 
                        {
                            if (__local__3_5.next()) 
                                __state = 17;
                             else 
                                __state = 18;
                            break;
                        }
                        //* (68)             count++;
                        case 17: 
                        {
                            __breakLevel = 4;
                            __state = 16;
                            __local__3_4++ ;
                            break;
                        }
                        //* (70) 	    consoleIface.showConsoleDebug("Number of cells believed empty of obstacles: "+count);
                        case 18: 
                        {
                            __state = 19;
                            consoleIface.showConsoleDebug("Number of cells believed empty of obstacles: " + __local__3_4);
                            break;
                        }
                        //* (73) 		count = 0;
                        case 19: 
                        {
                            __state = 20;
                            // Now print the cells that are known to be blocked

                            __local__3_4 = 0;
                            break;
                        }
                        //* (74)         for ( Cursor c = bel_cellEmpty_dat.get($x,$y).negate() ; c.next() ; ) {
                        case 20: 
                        {
                            __local__3_6 = (aos.jack.jak.cursor.Cursor) genCursor(2);
                            __state = 21;
                            break;
                        }
                        //* (74)         for ( Cursor c = bel_cellEmpty_dat.get($x,$y).negate() ; c.next() ; ) {
                        case 21: 
                        {
                            if (__local__3_6.next()) 
                                __state = 22;
                             else 
                                __state = 23;
                            break;
                        }
                        //* (75)             count++;
                        case 22: 
                        {
                            __breakLevel = 4;
                            __state = 21;
                            __local__3_4++ ;
                            break;
                        }
                        //* (77) 	    consoleIface.showConsoleDebug("Number of believed obstructed cells: "+count);
                        case 23: 
                        {
                            __state = 24;
                            consoleIface.showConsoleDebug("Number of believed obstructed cells: " + __local__3_4);
                            break;
                        }
                        //* (54)     #reasoning method
                        case 24: 
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
                    return (bel_currentRequestActionId_dat.get(__local__3_0,__local__3_1));
                }
                case 1: 
                {
                    return (bel_cellEmpty_dat.get(__local__3_2,__local__3_3));
                }
                case 2: 
                {
                    return (bel_cellEmpty_dat.get(__local__3_2,__local__3_3).negate());
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
            return rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__3_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__3_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__3_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__3_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__3_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__3_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__3_6);
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
