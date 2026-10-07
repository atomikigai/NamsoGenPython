package b5;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1402a;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        c cVar = this.f1402a;
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            if (keyEvent.getAction() == 1) {
                cVar.k();
            }
            return true;
        }
        if (i != 6) {
            return false;
        }
        cVar.k();
        return true;
    }
}
