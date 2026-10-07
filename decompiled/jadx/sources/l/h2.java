package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends r1 {
    public k.n A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f6288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d2 f6289z;

    public h2(Context context, boolean z4) {
        super(context, z4);
        if (1 == g2.a(context.getResources().getConfiguration())) {
            this.f6287x = 21;
            this.f6288y = 22;
        } else {
            this.f6287x = 22;
            this.f6288y = 21;
        }
    }

    @Override // l.r1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.i iVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f6289z != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (k.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (k.i) adapter;
                headersCount = 0;
            }
            k.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= iVar.getCount()) ? null : iVar.getItem(i);
            k.n nVar = this.A;
            if (nVar != nVarB) {
                k.l lVar = iVar.f5856a;
                if (nVar != null) {
                    this.f6289z.m(lVar, nVar);
                }
                this.A = nVarB;
                if (nVarB != null) {
                    this.f6289z.l(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f6287x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f6288y) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.i) adapter).f5856a.c(false);
        return true;
    }

    public void setHoverListener(d2 d2Var) {
        this.f6289z = d2Var;
    }

    @Override // l.r1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
