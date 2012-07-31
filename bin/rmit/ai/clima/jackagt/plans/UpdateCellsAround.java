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
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.comms.Cell;
import rmit.ai.clima.gui.grid.GridPoint;
import java.lang.Object;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class UpdateCellsAround extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EUpdateBel eupdatebel_h;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/UpdateCellsAround.plan",
            "body",
            "43",
            "44",
            "45",
            "46",
            "54",
            "54",
            "57",
            "58",
            "60",
            "62",
            "62",
            "65",
            "68",
            "69",
            "72",
            "39",
            "62",
            "54",
            "39"};
    private final static java.lang.String[] __planVariableNames = {
            "eupdatebel_h",
            "bel_goldAt_dat",
            "bel_cellEmpty_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.EUpdateBel",
            "GoldAt",
            "rmit.ai.clima.jackagt.data.CellEmpty"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "step",
            "posX",
            "posY",
            "cells",
            "locDir",
            "setToNoGold",
            "i",
            "loc",
            "j"};
    private final static java.lang.String[] __fsmTypes_body = {
            "int",
            "int",
            "int",
            "Cell[]",
            "String",
            "boolean",
            "int",
            "GridPoint",
            "int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__21_0",
            "__local__21_1",
            "__local__21_2",
            "__local__21_3",
            "__local__21_4",
            "__local__21_5",
            "__local__21_6",
            "__local__21_7",
            "__local__21_8"};
    /******** End PDT Design Block *** DO NOT EDIT IT *********/

    static boolean relevant(rmit.ai.clima.jackagt.events.EUpdateBel ev)
    {
        return true;
    }
    
    public UpdateCellsAround()
    {
    }
    
    private UpdateCellsAround(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.UpdateCellsAround __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eupdatebel_h = __env.eupdatebel_h;
        bel_goldAt_dat = __env.bel_goldAt_dat;
        bel_cellEmpty_dat = __env.bel_cellEmpty_dat;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eupdatebel_h = (rmit.ai.clima.jackagt.events.EUpdateBel) __a.findEvent("rmit.ai.clima.jackagt.events.EUpdateBel");
        if (eupdatebel_h == null) {
            warning("Failed to find EUpdateBel eupdatebel_h");
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
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.UpdateCellsAround.__bodyFSM();
    }
    
    private UpdateCellsAround(rmit.ai.clima.jackagt.events.EUpdateBel __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.UpdateCellsAround __env)
    {
        this(__t,__env);
        this.eupdatebel_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eupdatebel_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EUpdateBel";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.EUpdateBel) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EUpdateBel)) 
            return null;
        rmit.ai.clima.jackagt.events.EUpdateBel __e1 = (rmit.ai.clima.jackagt.events.EUpdateBel) __e;
        return new rmit.ai.clima.jackagt.plans.UpdateCellsAround(__e1,__t,this);
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
                return aos.util.ToObject.box(eupdatebel_h);
            }
            case 1: 
            {
                return aos.util.ToObject.box(bel_goldAt_dat);
            }
            case 2: 
            {
                return aos.util.ToObject.box(bel_cellEmpty_dat);
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
        int __local__21_0;
        int __local__21_1;
        int __local__21_2;
        rmit.ai.clima.comms.Cell[] __local__21_3;
        java.lang.String __local__21_4;
        boolean __local__21_5;
        int __local__21_6;
        rmit.ai.clima.gui.grid.GridPoint __local__21_7;
        int __local__21_8;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-UpdateCellsAround.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.UpdateCellsAround.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("UpdateCellsAround.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (43)         int step = eupdatebel_h.step;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__21_0 = eupdatebel_h.step;
                            __state = 11;
                            break;
                        }
                        //* (44)         int posX = eupdatebel_h.currentPos.x;
                        case 11: 
                        {
                            __local__21_1 = eupdatebel_h.currentPos.x;
                            __state = 12;
                            break;
                        }
                        //* (45)         int posY = eupdatebel_h.currentPos.y;
                        case 12: 
                        {
                            __local__21_2 = eupdatebel_h.currentPos.y;
                            __state = 13;
                            break;
                        }
                        //* (46)         Cell[] cells = eupdatebel_h.cells;	// the array of adjacent cells
                        case 13: 
                        {
                            __local__21_3 = eupdatebel_h.cells;
                            __state = 14;
                            break;
                        }
                        //* (54)         for(int i=0; i < cells.length; i++) {	// interate on each cell
                        case 14: 
                        {
                            __local__21_6 = 0;
                            __state = 15;
                            break;
                        }
                        //* (54)         for(int i=0; i < cells.length; i++) {	// interate on each cell
                        case 15: 
                        {
                            if (__local__21_6 < __local__21_3.length) 
                                __state = 16;
                             else 
                                __state = 28;
                            break;
                        }
                        //* (57)             locDir = cells[i].id;	// first, get its direction (e.g., n, nw, s, se, etc.)
                        case 16: 
                        {
                            __breakLevel = 4;
                            __state = 17;
                            // interate on each cell
// Calculate the exact point of cells[i]: store it in GridPoint loc

                            __local__21_4 = __local__21_3[__local__21_6].id;
                            break;
                        }
                        //* (58)             GridPoint loc = GridPoint.getFromDir(posX, posY, locDir);
                        case 17: 
                        {
                            __local__21_7 = rmit.ai.clima.gui.grid.GridPoint.getFromDir(__local__21_1,__local__21_2,__local__21_4);
                            __state = 18;
                            break;
                        }
                        //* (60)            setToNoGold = true;	// Initially, assume the cell does not contain goal	            
                        case 18: 
                        {
                            __state = 19;
                            __local__21_5 = true;
                            break;
                        }
                        //* (62)            for(int j = 0; j < cells[i].marks.length; j++) {
                        case 19: 
                        {
                            __local__21_8 = 0;
                            __state = 20;
                            break;
                        }
                        //* (62)            for(int j = 0; j < cells[i].marks.length; j++) {
                        case 20: 
                        {
                            if (__local__21_8 < __local__21_3[__local__21_6].marks.length) 
                                __state = 21;
                             else 
                                __state = 27;
                            break;
                        }
                        //* (65)                if( !(cells[i].marks[j].type.equalsIgnoreCase("unknown")) ) {
                        case 21: 
                        {
                            __breakLevel = 8;
                            if (!(__local__21_3[__local__21_6].marks[__local__21_8].type.equalsIgnoreCase("unknown"))) 
                                __state = 22;
                             else 
                                __state = 25;
                            break;
                        }
                        //* (68)                     if( cells[i].marks[j].type.equalsIgnoreCase("obstacle") ) {
                        case 22: 
                        {
                            __breakLevel = 10;
                            if (__local__21_3[__local__21_6].marks[__local__21_8].type.equalsIgnoreCase("obstacle")) 
                                __state = 23;
                             else 
                                __state = 24;
                            break;
                        }
                        //* (69)                         bel_cellEmpty_dat.add(loc.x, loc.y, Cursor.FALSE);
                        case 23: 
                        {
                            __breakLevel = 12;
                            __state = 26;
                            bel_cellEmpty_dat.add(__local__21_7.x,__local__21_7.y,aos.jack.jak.cursor.Cursor.FALSE);
                            break;
                        }
                        //* (72)                         bel_cellEmpty_dat.add(loc.x, loc.y, Cursor.TRUE);
                        case 24: 
                        {
                            __breakLevel = 12;
                            __state = 26;
                            // The cell must be empty if there is no obstacle

                            bel_cellEmpty_dat.add(__local__21_7.x,__local__21_7.y,aos.jack.jak.cursor.Cursor.TRUE);
                            break;
                        }
                        //* (39)     #reasoning method
                        case 25: 
                        {
                            __breakLevel = 10;
                            __state = 26;
                            break;
                        }
                        //* (62)            for(int j = 0; j < cells[i].marks.length; j++) {
                        case 26: 
                        {
                            __state = 20;
                            __local__21_8++ ;
                            break;
                        }
                        //* (54)         for(int i=0; i < cells.length; i++) {	// interate on each cell
                        case 27: 
                        {
                            __state = 15;
                            __local__21_6++ ;
                            break;
                        }
                        //* (39)     #reasoning method
                        case 28: 
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
            return rmit.ai.clima.jackagt.plans.UpdateCellsAround.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.UpdateCellsAround.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__21_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__21_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__21_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__21_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__21_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__21_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__21_6);
                }
                case 7: 
                {
                    return aos.util.ToObject.box(__local__21_7);
                }
                case 8: 
                {
                    return aos.util.ToObject.box(__local__21_8);
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
