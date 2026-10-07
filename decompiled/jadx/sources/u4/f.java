package u4;

import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import app.namso_gen.spacehowen.R;
import w8.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public FrameLayout f8858g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public i f8860i0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Handler f8859h0 = new Handler();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f8861j0 = 0;

    @Override // androidx.fragment.app.s
    public void M(Bundle bundle, View view) {
        i iVar = new i(new ContextThemeWrapper(r(), this.f8855f0.w().f8397d));
        this.f8860i0 = iVar;
        iVar.setIndeterminate(true);
        this.f8860i0.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.invisible_frame);
        this.f8858g0 = frameLayout;
        frameLayout.addView(this.f8860i0, layoutParams);
    }

    @Override // u4.g
    public final void b() {
        this.f8859h0.postDelayed(new androidx.activity.d(this, 18), Math.max(750 - (System.currentTimeMillis() - this.f8861j0), 0L));
    }

    @Override // u4.g
    public final void i(int i) {
        if (this.f8860i0.getVisibility() == 0) {
            this.f8859h0.removeCallbacksAndMessages(null);
        } else {
            this.f8861j0 = System.currentTimeMillis();
            this.f8860i0.setVisibility(0);
        }
    }
}
