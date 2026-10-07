package c9;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ea.j;
import h3.k1;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import jc.i;
import q0.g0;
import q0.v0;
import r0.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements x, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1809b;

    public /* synthetic */ b(Object obj, int i) {
        this.f1809b = obj;
        this.f1808a = i;
    }

    @Override // r0.x
    public boolean c(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1809b;
        int i = this.f1808a;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(q1.a.m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f2505p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f2505p.get();
        c cVar = new c(sideSheetBehavior, i, 0);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = v0.f7946a;
            if (g0.b(view2)) {
                view2.post(cVar);
                return true;
            }
        }
        cVar.run();
        return true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        MainActivity mainActivity = (MainActivity) this.f1809b;
        int i = MainActivity.f1283j0;
        i.e(task, "task");
        if (task.isSuccessful()) {
            jb.b bVar = mainActivity.P;
            if (bVar == null) {
                i.i("remoteConfig");
                throw null;
            }
            if (Integer.parseInt(bVar.c("new_version_code")) > this.f1808a) {
                j jVar = new j((Context) mainActivity, R.style.MyDialogTheme);
                ((g.b) jVar.f3530b).f3972f = mainActivity.getString(R.string.update_message);
                jVar.k(mainActivity.getString(R.string.btn_update), new k1(mainActivity, 1));
                g.f fVarM = jVar.m();
                fVarM.setCancelable(false);
                fVarM.b(-1).setTextColor(mainActivity.getColor(R.color.teal_700));
            }
        }
    }
}
