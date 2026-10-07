package u4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import app.namso_gen.spacehowen.R;
import w8.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends c {
    public i M;
    public final Handler L = new Handler();
    public long N = 0;

    @Override // u4.g
    public final void b() {
        this.L.postDelayed(new d(this, 0), Math.max(750 - (System.currentTimeMillis() - this.N), 0L));
    }

    @Override // u4.g
    public final void i(int i) {
        if (this.M.getVisibility() == 0) {
            this.L.removeCallbacksAndMessages(null);
        } else {
            this.N = System.currentTimeMillis();
            this.M.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_invisible);
        i iVar = new i(new ContextThemeWrapper(this, w().f8397d));
        this.M = iVar;
        iVar.setIndeterminate(true);
        this.M.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ((FrameLayout) findViewById(R.id.invisible_frame)).addView(this.M, layoutParams);
    }

    @Override // u4.c
    public final void u(Intent intent, int i) {
        setResult(i, intent);
        this.L.postDelayed(new d(this, 1), Math.max(750 - (System.currentTimeMillis() - this.N), 0L));
    }
}
