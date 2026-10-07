// Ghidra headless script: inspect recovered application functions without executing the APK.
// @category Namso
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.PrintWriter;

public class DumpNamso extends GhidraScript {
    public void run() throws Exception {
        String[] args = getScriptArgs();
        DecompInterface decompiler = new DecompInterface();
        decompiler.openProgram(currentProgram);
        int count = 0, selected = 0;
        try (PrintWriter out = new PrintWriter(args[0], "UTF-8")) {
            out.println("Program: " + currentProgram.getName());
            out.println("Language: " + currentProgram.getLanguageID());
            for (Function function : currentProgram.getFunctionManager().getFunctions(true)) {
                count++;
                String name = function.getName(true);
                out.println("FUNCTION " + function.getEntryPoint() + " " + name);
                if ((name.contains("h3") && (name.contains("e1") || name.contains("c0") || name.contains("e0") || name.contains("x::") || name.contains("k::"))) && selected < 80) {
                    selected++;
                    DecompileResults result = decompiler.decompileFunction(function, 15, monitor);
                    if (result.decompileCompleted()) {
                        out.println(result.getDecompiledFunction().getC());
                    } else {
                        out.println("DECOMPILER_ERROR " + result.getErrorMessage());
                    }
                }
                if (monitor.isCancelled()) break;
            }
            out.println("TOTAL_FUNCTIONS " + count + " SELECTED " + selected);
        } finally {
            decompiler.dispose();
        }
    }
}
